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


    //editing entities
    @RequestMapping(value = {"selectforedit"},method = RequestMethod.GET )
    public String selectforedit(ModelAndView mav){

        return "EntityEditing/UserEditing/selectforedit";
    }


    @RequestMapping(value = {"findforedit"},method = RequestMethod.GET )
    public String findforedit(ModelAndView mav){

        return "EntityEditing/UserEditing/findforedit";
    }





}
