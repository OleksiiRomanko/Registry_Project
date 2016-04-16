package com.kp_42.Controllers;

import com.kp_42.Model.Entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

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


}
