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

/**
 * Created by user on 14.04.2016.
 */

@Controller
@RequestMapping("/admin/user")
@SessionAttributes(value = {"UsersEntity",
        "PassportsEntity",
        "BirthCertificateEntity",
        "LivingPlaceEntity",
        "WorkPlaceEntity"})
public class UserController {



    @ModelAttribute("UsersEntity")
    public UsersEntity userModel(){
        return new UsersEntity();
    }
    @ModelAttribute("PassportsEntity")
    public PassportsEntity passportModel(){
        return new PassportsEntity();
    }
    @ModelAttribute("BirthCertificateEntity")
    public BirthCertificateEntity certificateModel(){
        return new BirthCertificateEntity();
    }
    @ModelAttribute("LivingPlaceEntity")
    public LivingPlaceEntity livingPlaceModel(){
        return new LivingPlaceEntity();
    }
    @ModelAttribute("WorkPlaceEntity")
    public WorkplaceEntity workplaceModel(){
        return new WorkplaceEntity();
    }

    @RequestMapping(value = "/add/step/1",method = RequestMethod.GET)
    public String createUserFields(ModelMap map){
        return "EntityCreating/UserCreating/personalinformation";
    }

    @RequestMapping(value = "/add/step/2", method = RequestMethod.POST)
    public String createPassport(@Valid @ModelAttribute("UsersEntity") UsersEntity user, BindingResult result){
        if(result.hasErrors())return "EntityCreating/UserCreating/personalinformation";
        return "EntityCreating/UserCreating/passport";
    }

    @RequestMapping(value = "/add/step/3", method = RequestMethod.POST)
    public String createCertificate(@ModelAttribute("UsersEntity") UsersEntity user,
                                    @Valid @ModelAttribute("PassportsEntity")PassportsEntity passport,
                                    BindingResult result){
        if(result.hasErrors())return "EntityCreating/UserCreating/passport";
        return "EntityCreating/UserCreating/certificate";
    }

    @RequestMapping(value = "/add/step/4", method = RequestMethod.POST)
    public String createLivingPlace(@ModelAttribute("UsersEntity") UsersEntity user,
                                    @ModelAttribute("PassportsEntity")PassportsEntity passport,
                                    @Valid @ModelAttribute("BirthCertificateEntity")BirthCertificateEntity certificate,
                                    BindingResult result){

        if(result.hasErrors())return "EntityCreating/UserCreating/certificate";
        return "EntityCreating/UserCreating/livingplace";

    }

    @RequestMapping(value = "/add/step/5", method = RequestMethod.POST)
    public String createWorkplace(@ModelAttribute("UsersEntity") UsersEntity user,
                                    @ModelAttribute("PassportsEntity")PassportsEntity passport,
                                    @ModelAttribute("BirthCertificateEntity")BirthCertificateEntity certificate,
                                    @Valid @ModelAttribute("LivingPlaceEntity") LivingPlaceEntity livingPlace,
                                    BindingResult result){

        if(result.hasErrors())return "EntityCreating/UserCreating/livingplace";
        return "EntityCreating/UserCreating/workplace";

    }



    @RequestMapping(value = "/add/step/6", method = RequestMethod.POST)
    public String createUser(@ModelAttribute("UsersEntity") UsersEntity user,
                                  @ModelAttribute("PassportsEntity")PassportsEntity passport,
                                  @ModelAttribute("BirthCertificateEntity")BirthCertificateEntity certificate,
                                  @ModelAttribute("LivingPlaceEntity") LivingPlaceEntity livingPlace,
                                  @Valid @ModelAttribute("WorkPlaceEntity")WorkplaceEntity workplace,
                                  BindingResult result,
                                  ModelMap mav){

        if(result.hasErrors())return "EntityCreating/UserCreating/workplace";
        System.out.println();
        System.out.println(user.toString());
        System.out.println(passport.toString());
        System.out.println(certificate.toString());
        System.out.println(livingPlace.toString());
        System.out.println(workplace.toString());

//        mav.put("success","Нова особа успішно додана до бази даних!");

        return "redirect:/admin";
    }



}
