package com.kp_42.Controllers;

import com.kp_42.Model.Entity.CriminalActEntity;
import com.kp_42.Model.Entity.LawEntity;
import com.kp_42.Model.Entity.UsersEntity;
import com.kp_42.Model.Interface.IPersistService;
import com.kp_42.Model.Interface.ISearchService;
import com.kp_42.Model.Repositories.UsersRepository;
import org.hibernate.Criteria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 14.04.2016.
 */

@Controller
@RequestMapping("/admin")
@SessionAttributes(value = {"Criteria"})
public class AdminController {


    @Inject
    @Named("SearchService")
    private ISearchService searchService;
    @Inject
    @Named("PersistService")
    private IPersistService persistService;

    @ModelAttribute("UsersEntity")
    public UsersEntity userModel(){ return new UsersEntity(); }


    @ModelAttribute("Criteria")
    public UsersRepository.UserCriteria criteriaModel(){return new UsersRepository.UserCriteria(null,null,null,null);}

    @RequestMapping("")
    public String adminpage(){

        return "adminpage";
    }


    @RequestMapping(value = "/tomenu",method = RequestMethod.GET)
    public String backToAdmin(ModelMap map){
        return "redirect:/admin";
    }

    @RequestMapping(value = "/fulltable",method = RequestMethod.POST)
    public String showTable(ModelMap map, @ModelAttribute("Criteria")UsersRepository.UserCriteria criteria){


        List<UsersEntity>  allusers = searchService.getAllUsers();
        allusers = criteria.filter(allusers);
        map.addAttribute("allusers",allusers);
        System.out.println(allusers);
        return "fullbaselist";
    }

}
