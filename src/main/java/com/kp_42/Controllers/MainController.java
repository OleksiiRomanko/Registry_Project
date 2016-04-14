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

}
