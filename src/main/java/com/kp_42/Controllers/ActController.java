package com.kp_42.Controllers;

import com.kp_42.Model.Entity.CriminalActEntity;
import com.kp_42.Model.Entity.LawEntity;
import com.kp_42.Model.Entity.UsersEntity;
import com.kp_42.Model.Interface.ISearchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Controller
@RequestMapping("/admin/act")
@SessionAttributes(value = {"UsersEntity",
        "LawEntity",
        "CriminalActEntity"})

public class ActController {


    @Inject
    @Named("SearchService")
    private ISearchService searchService;
    @ModelAttribute("UsersEntity")
    public UsersEntity userModel(){
        return new UsersEntity();
    }

    @ModelAttribute("LawEntity")
    public LawEntity lawModel() { return new LawEntity(); }

    @ModelAttribute("CriminalActEntity")
    public CriminalActEntity actModel(){ return new CriminalActEntity(); }



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

    @RequestMapping(value = "/add/{id}",method = RequestMethod.POST)
    public String addLaw(ModelMap map,@PathVariable Integer id){
        System.out.printf("id - " + id);
        return "EntityCreating/ActCreating/finduser";
    }


}
