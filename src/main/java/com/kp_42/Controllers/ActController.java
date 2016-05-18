package com.kp_42.Controllers;

import com.kp_42.Model.Entity.CriminalActEntity;
import com.kp_42.Model.Entity.LawEntity;
import com.kp_42.Model.Entity.UsersEntity;
import com.kp_42.Model.Interface.IDeleteService;
import com.kp_42.Model.Interface.IPersistService;
import com.kp_42.Model.Interface.ISearchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/admin/act")
@SessionAttributes(value = {"CriminalActEntity",
        "LawWrapper"})

public class ActController {

    class LawWrapper{
        private List<Integer> lawsId = new ArrayList<>();

        public List<Integer> getLawsId() {
            return lawsId;
        }

        public void setLawsId(List<Integer> lawsId) {
            this.lawsId = lawsId;
        }

        @Override
        public String toString() {
            return "LawWrapper{" +
                    "lawsId=" + lawsId +
                    '}';
        }
    }



    @Inject
    @Named("SearchService")
    private ISearchService searchService;
    @Inject
    @Named("PersistService")
    private IPersistService persistService;
    @Inject
    @Named("DeleteService")
    private IDeleteService deleteService;

    @ModelAttribute("CriminalActEntity")
    public CriminalActEntity actModel(){ return new CriminalActEntity(); }

    @ModelAttribute("LawWrapper")
    public LawWrapper lawWrapperModel(){ return new LawWrapper(); }




    @RequestMapping(value = "/add/",method = RequestMethod.GET)
    public String createUserFields(ModelMap map){
        return "EntityCreating/ActCreating/finduser";
    }


    @RequestMapping(value = "/add/select")
    public String findUser(@RequestParam("credentials") String credentials, ModelMap map){
        List<UsersEntity> list = searchService.findUsersByCredentials(credentials);
        if(list == null) return "EntityCreating/ActCreating/finduser";
        map.addAttribute("users",list);
        return "EntityCreating/ActCreating/selectuser";
    }

    @ModelAttribute("SelectedLaws")
    public List<Integer> getLawModel(){

        return new ArrayList<Integer>();
    }

    @RequestMapping(value = "/add/{id}",method = RequestMethod.POST)
    public String selectLaws(ModelMap map,@PathVariable Integer id){
        System.out.printf("id - " + id);
        UsersEntity user = searchService.findUser(id);
        if(user.getCriminalAct() != null)return "redirect:/admin/act/add/";
        map.addAttribute("user",user);
        List<LawEntity> laws = searchService.getAllLaws();
        map.addAttribute("laws",laws);
        return "EntityCreating/ActCreating/selectlaw";
    }

    @RequestMapping(value = "/add/{id}/act",method = RequestMethod.POST)
    public String fillAct(ModelMap map, @PathVariable Integer id,
                          @ModelAttribute("LawWrapper") LawWrapper wrapper){
        map.addAttribute("user",searchService.findUser(id));
        System.out.println(wrapper.toString());
        return "EntityCreating/ActCreating/createact";
    }

    @RequestMapping(value = "/add/{id}/act/add",method = RequestMethod.POST)
    public String bindAct(ModelMap map, @PathVariable Integer id,
                          @ModelAttribute("LawWrapper") LawWrapper wrapper,
                          @Valid @ModelAttribute("CriminalActEntity") CriminalActEntity act,
                          BindingResult result, SessionStatus status){

        if(result.hasErrors())return "EntityCreating/ActCreating/createact";
        UsersEntity user = searchService.findUser(id);
        List<LawEntity> laws = new ArrayList<>();
        wrapper.getLawsId().forEach(integer -> laws.add(searchService.findLaw(integer)));
        act.setUser(user);
        act.setLaw(laws);
        System.out.println(act.toString());
        persistService.save(act);
        status.setComplete();
        return "redirect:/admin/";
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String findActByPersonPage(ModelMap map){
        return "EntityEditing/ActEditing/findactbyuser";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String findUser(ModelMap map, @RequestParam("Credentials") String credentials){

        List<UsersEntity> list = searchService.findUsersByCredentials(credentials).stream()
                .filter((usersEntity -> usersEntity.getCriminalAct()!=null))
                .collect(Collectors.toList());
        if(list == null) return "EntityEditing/ActEditing/findactbyuser";
        map.addAttribute("users",list);
        return "EntityEditing/ActEditing/selectuser";

    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
    public String deleteUser(ModelMap map, @PathVariable Integer id) {
        CriminalActEntity actEntity = searchService.findUser(id).getCriminalAct();
        deleteService.deleteAct(actEntity);
        return "redirect:/admin";
    }





}
