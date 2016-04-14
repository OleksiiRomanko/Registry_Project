package com.kp_42.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by user on 14.04.2016.
 */

@Controller
@RequestMapping("/admin")
public class AdminController {


    @RequestMapping("")
    public String adminpage(ModelAndView mav){

        return "adminpage";
    }

}
