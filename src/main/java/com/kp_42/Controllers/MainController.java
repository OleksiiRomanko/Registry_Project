package com.kp_42.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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



    @RequestMapping(value = "login")
    public String login(ModelAndView mav ){

        return "loginpage";
    }

    @RequestMapping(value = "login", params = "retry")
    public String denied(ModelMap mav){

        mav.put("error","Помилка авторизації! Неправильно введений логін чи пароль.");

        return "loginpage";
    }
    @RequestMapping("logout")
    public String logout(ModelAndView mav){

        return "mainpage";
    }





    //
    @RequestMapping(value = {"adminpage"},method = RequestMethod.GET )
    public String adminpage(ModelAndView mav){

        return "adminpage";
    }

    @RequestMapping(value = {"personalinformation"},method = RequestMethod.GET )
    public String personalinformation(ModelAndView mav){

        return "EntityCreating/UserCreating/personalinformation";
    }

    @RequestMapping(value = {"passport"},method = RequestMethod.GET )
    public String passporte(ModelAndView mav){

        return "EntityCreating/UserCreating/passport";
    }

    @RequestMapping(value = {"certificate"},method = RequestMethod.GET )
    public String certificate(ModelAndView mav){

        return "EntityCreating/UserCreating/certificate";
    }

    @RequestMapping(value = {"workplace"},method = RequestMethod.GET )
    public String workplace(ModelAndView mav){

        return "EntityCreating/UserCreating/workplace";
    }




    //other entities
    @RequestMapping(value = {"addlaw"},method = RequestMethod.GET )
    public String addlaw(ModelAndView mav){

        return "EntityCreating/addlaw";
    }

    @RequestMapping(value = {"createact"},method = RequestMethod.GET )
    public String createact(ModelAndView mav){

        return "EntityCreating/ActCreating/createact";
    }

    @RequestMapping(value = {"finduser"},method = RequestMethod.GET )
    public String finduser(ModelAndView mav){

        return "EntityCreating/ActCreating/finduser";
    }
    @RequestMapping(value = {"selectlaw"},method = RequestMethod.GET )
    public String selectlaw(ModelAndView mav){

        return "EntityCreating/ActCreating/selectlaw";
    }

    @RequestMapping(value = {"selectuser"},method = RequestMethod.GET )
    public String selectuser(ModelAndView mav){

        return "EntityCreating/ActCreating/selectuser";
    }


}
