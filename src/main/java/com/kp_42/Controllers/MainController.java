package com.kp_42.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by user on 14.04.2016.
 */

@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(value = {"","mainpage","home","index"},method = RequestMethod.GET )
    public String mainpage(ModelAndView mav){

        return "mainpage";
    }

    @RequestMapping(value = {"adminpage"},method = RequestMethod.GET )
    public String adminpage(ModelAndView mav){

        return "adminpage";
    }

    @RequestMapping(value = {"personalinformation"},method = RequestMethod.GET )
    public String personalinformation(ModelAndView mav){

        return "personalinformation";
    }

    @RequestMapping(value = {"passport"},method = RequestMethod.GET )
    public String passporte(ModelAndView mav){

        return "passport";
    }

    @RequestMapping(value = {"certificate"},method = RequestMethod.GET )
    public String certificate(ModelAndView mav){

        return "certificate";
    }

    @RequestMapping(value = {"workplace"},method = RequestMethod.GET )
    public String workplace(ModelAndView mav){

        return "workplace";
    }

    @RequestMapping(value = {"livingplace"},method = RequestMethod.GET )
    public String livingplace(ModelAndView mav){

        return "livingplace";
    }


}
