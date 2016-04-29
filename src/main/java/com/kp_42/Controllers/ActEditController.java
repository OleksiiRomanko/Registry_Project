package com.kp_42.Controllers;

import com.kp_42.Model.Entity.*;
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

/**
 * Created by user on 28.04.2016.
 */

@Controller
@RequestMapping("/admin/act")
@SessionAttributes(value = {"UsersEntity",
        "CriminalActEntity",
        "LawEntity","LawsWrapper"})

public class ActEditController {
    @Inject
    @Named("PersistService")
    private IPersistService persistService;
    @Inject
    @Named("SearchService")
    private ISearchService searchService;

    @Inject
    @Named("DeleteService")
    private IDeleteService deleteService;


    class LawsWrapper{
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

    @ModelAttribute("LawsWrapper")
    public LawsWrapper lawWrapperModel(){ return new LawsWrapper(); }


    @RequestMapping(value = "/{id}/edit/extrafields", method = RequestMethod.POST)
    public String editActInfo(ModelMap map, @PathVariable Integer id, @Valid @ModelAttribute("CriminalActEntity") CriminalActEntity actEntity,
                               BindingResult result,SessionStatus status) {

        if(result.hasErrors()) return "EntityEditing/ActCreating/changeact";

        CriminalActEntity actUpdate =  searchService.findUser(id).getCriminalAct();
        actUpdate.setCriminalDescription(actEntity.getCriminalDescription());
        actUpdate.setPenaltyType(actEntity.getPenaltyType());
        actUpdate.setExtraction(actEntity.getExtraction());
        actUpdate.setTribunalDate(actEntity.getTribunalDate());
        actUpdate.setCriminalDescription(actEntity.getCriminalDescription());
        actUpdate.setDateoffPenalty(actEntity.getDateoffPenalty());
        actUpdate.setActivationDate(actEntity.getActivationDate());
        actUpdate.setCriminalType(actEntity.getCriminalType());
        actUpdate.setDateRepaymentConvitions(actEntity.getDateRepaymentConvitions());
        actUpdate.setGroundOfPenalty(actEntity.getGroundOfPenalty());
        actUpdate.setProcessOfCriminal(actEntity.getProcessOfCriminal());
        persistService.save(actUpdate);
        status.setComplete();
        return "redirect:/admin";
    }

    @RequestMapping(value = "/{id}/edit/extrafields", method = RequestMethod.GET)
    public String getEditActInfo(ModelMap map, @PathVariable Integer id) {

        CriminalActEntity actEntity = searchService.findActByUser(searchService.findUser(id));
        map.addAttribute("CriminalActEntity",actEntity);
        map.addAttribute("user",searchService.findUser(id));
        return "EntityEditing/ActEditing/changeact";
    }

    @RequestMapping(value = "/{id}/changelaw",method = RequestMethod.POST)
    public String selectLaws(ModelMap map, @PathVariable Integer id,
                             @ModelAttribute("LawsWrapper") LawsWrapper wrapper,
                             @ModelAttribute("CriminalActEntity") CriminalActEntity act,
                             BindingResult result, SessionStatus status){

        if(result.hasErrors())return "EntityEditing/ActEditing/changeact";
        UsersEntity user = searchService.findUser(id);
        List<LawEntity> laws = new ArrayList<>();
        wrapper.getLawsId().forEach(integer -> laws.add(searchService.findLaw(integer)));
        act.setUser(user);
        act.setLaw(laws);
        System.out.println(act.toString());
        persistService.save(act);
        status.setComplete();

        return "EntityEditing/ActEditing/changelaws";
    }


    @RequestMapping(value = "/{id}/changelaw",method = RequestMethod.GET)
    public String getselectLaws(ModelMap map,@PathVariable Integer id){
        System.out.printf("id - " + id);
        CriminalActEntity actEntity = searchService.findUser(id).getCriminalAct();
        map.addAttribute("user",searchService.findUser(id));
        map.addAttribute("CriminalActEntity",actEntity);
        List<LawEntity> laws = searchService.getAllLaws();
        map.addAttribute("laws",laws);
        return "EntityEditing/ActEditing/changelaws";
    }






}
