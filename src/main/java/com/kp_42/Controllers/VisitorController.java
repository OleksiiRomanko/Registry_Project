package com.kp_42.Controllers;

import com.kp_42.Model.Entity.LawEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;


@Controller
@RequestMapping("mainpage/")
public class VisitorController {


    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String getSearchingResult(ModelMap map) {
        return "resultpage";
    }

    @RequestMapping(value = "/goback", method = RequestMethod.GET)
    public String goToMain(ModelMap map) {
        return "redirect:/mainpage";
    }

}
