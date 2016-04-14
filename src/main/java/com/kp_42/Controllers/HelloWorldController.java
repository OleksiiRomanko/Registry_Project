package com.kp_42.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by user on 05.03.2016.
 */

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(ModelMap map){


        return "Hello";
    }

}
