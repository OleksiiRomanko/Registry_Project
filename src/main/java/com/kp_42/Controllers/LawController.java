package com.kp_42.Controllers;


import com.kp_42.Model.Entity.LawEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("admin/law")
public class LawController {

    @RequestMapping(value  = "/add", method = RequestMethod.GET)
    public String getPage(ModelMap map){
        LawEntity entity = new LawEntity();
        map.addAttribute("LawEntity", entity);

        return "/EntityCreating/LawCreating/addlaw";
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String createLaw(ModelMap map, @ModelAttribute("LawEntity")LawEntity lawEntity) {

        System.out.println(lawEntity.toString());
        return "/admin";
    }
}
