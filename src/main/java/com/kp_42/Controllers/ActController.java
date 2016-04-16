package com.kp_42.Controllers;

import com.kp_42.Model.Entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin/act")
@SessionAttributes(value = {"UsersEntity",
        "LawEntity",
        "CriminalActEntity"})

public class ActController {

    @ModelAttribute("UsersEntity")
    public UsersEntity userModel(){
        return new UsersEntity();
    }

    @ModelAttribute("LawEntity")
    public LawEntity lawModel() { return new LawEntity(); }

    @ModelAttribute("CriminalActEntity")
    public CriminalActEntity actModel(){ return new CriminalActEntity(); }



    @RequestMapping(value = "/add/step/1",method = RequestMethod.GET)
    public String createUserFields(ModelMap map){
        return "EntityCreating/ActCreating/finduser";
    }

    //backward mapping
    @RequestMapping(value = "/add/step/tomenu",method = RequestMethod.GET)
    public String backToAdmin(ModelMap map){
        return "redirect:/admin";
    }

    @RequestMapping(value = "/add/step/2", method = RequestMethod.POST)
    public String createPassport(){
        return "EntityCreating/ActCreating/selectuser";
    }

    //backward mapping
    @RequestMapping(value = "/add/step/from2to1",method = RequestMethod.GET)
    public String backToPersonalInfo(ModelMap map){
        return "EntityCreating/ActCreating/finduser";
    }

    @RequestMapping(value = "/add/step/3", method = RequestMethod.POST)
    public String createCertificate(){
        return "EntityCreating/ActCreating/selectlaw";
    }

    //backward mapping
    @RequestMapping(value = "/add/step/from3to2",method = RequestMethod.GET)
    public String backToPassport(ModelMap map){
        return "EntityCreating/ActCreating/selectuser";
    }

    @RequestMapping(value = "/add/step/4", method = RequestMethod.POST)
    public String createLivingPlace(){
        return "EntityCreating/ActCreating/createact";

    }

    //backward mapping
    @RequestMapping(value = "/add/step/from4to3",method = RequestMethod.GET)
    public String backToCertificate(ModelMap map){
        return "EntityCreating/ActCreating/selectlaw";
    }


    @RequestMapping(value = "/add/step/5", method = RequestMethod.POST)
    public String createAct(ModelMap mav){

//        @ModelAttribute("UsersEntity") UsersEntity user,
//        @ModelAttribute("PassportsEntity")PassportsEntity passport,
//        @ModelAttribute("BirthCertificateEntity")BirthCertificateEntity certificate,
//        @ModelAttribute("LivingPlaceEntity") LivingPlaceEntity livingPlace,
//        @Valid @ModelAttribute("WorkPlaceEntity")WorkplaceEntity workplace,
//        BindingResult result
//
//        if(result.hasErrors())return "EntityCreating/UserCreating/workplace";
//        System.out.println();
//        System.out.println(user.toString());
//        System.out.println(passport.toString());
//        System.out.println(certificate.toString());
//        System.out.println(livingPlace.toString());
//        System.out.println(workplace.toString());

//        mav.put("success","Нова особа успішно додана до бази даних!");

        return "redirect:/admin";
    }

}
