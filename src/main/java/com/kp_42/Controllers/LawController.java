package com.kp_42.Controllers;


import com.kp_42.Model.Entity.LawEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("admin/law")
@SessionAttributes(value = {"LawEntity"})

public class LawController {


    @ModelAttribute("LawEntity")
    public LawEntity lawModel(){
        return new LawEntity();
    }

    @RequestMapping(value  = "/add", method = RequestMethod.GET)
    public String getPage(ModelMap map){
        return "/EntityCreating/LawCreating/addlaw";
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String createLaw(ModelMap map,
                            @Valid @ModelAttribute("LawEntity")LawEntity lawEntity,
                            BindingResult result) {

        if (result.hasErrors())
            return "EntityCreating/LawCreating/addlaw";
        System.out.println(lawEntity.toString());
        return "redirect:/admin";
    }


}
