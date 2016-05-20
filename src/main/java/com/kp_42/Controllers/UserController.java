package com.kp_42.Controllers;

import com.kp_42.Model.Entity.*;
import com.kp_42.Model.Interface.IDeleteService;
import com.kp_42.Model.Interface.IPersistService;
import com.kp_42.Model.Interface.ISearchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/admin/user")
@SessionAttributes(value = {"UsersEntity",
        "PassportsEntity",
        "BirthCertificateEntity",
        "LivingPlaceEntity",
        "WorkPlaceEntity"})


public class UserController {

    @Inject
    @Named("PersistService")
    private IPersistService persistService;
    @Inject
    @Named("SearchService")
    private ISearchService searchService;

    @Inject
    @Named("DeleteService")
    private IDeleteService deleteService;

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
    public String createUser(     @ModelAttribute("UsersEntity") UsersEntity user,
                                  @ModelAttribute("PassportsEntity")PassportsEntity passport,
                                  @ModelAttribute("BirthCertificateEntity")BirthCertificateEntity certificate,
                                  @ModelAttribute("LivingPlaceEntity") LivingPlaceEntity livingPlace,
                                  @Valid @ModelAttribute("WorkPlaceEntity")WorkplaceEntity workplace,
                                  BindingResult result,
                                  ModelMap mav,
                                  SessionStatus status){

        if(result.hasErrors())return "EntityCreating/UserCreating/workplace";
        System.out.println();
        System.out.println(user.toString());
        System.out.println(passport.toString());
        System.out.println(certificate.toString());
        System.out.println(livingPlace.toString());
        System.out.println(workplace.toString());

        user.setBirthCertificate(certificate);
        user.setLivingPlace(livingPlace);
        user.setPassport(passport);
        user.setWorkplace(workplace);
        persistService.save(user);
        status.setComplete();
        return "redirect:/admin";
    }

    @RequestMapping(value = "/add/admin",method = RequestMethod.GET)
    public String backToAdmin(ModelMap mav){
        return "redirect:/admin";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String findPersonPage(ModelMap map){
        return "EntityEditing/UserEditing/findforedit";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String findUser(ModelMap map, @RequestParam("Credentials") String credentials){

        List<UsersEntity> list = searchService.findUsersByCredentials(credentials);
        if(list == null) return "EntityEditing/UserEditing/findforedit";
        map.addAttribute("users",list);
        return "EntityEditing/UserEditing/selectforedit";

    }

    @RequestMapping(value = "/{id}/delete/", method = RequestMethod.POST)
    public String deleteUser(ModelMap map, @PathVariable Integer id) {
        deleteService.deleteUser(id);
        return "redirect:/admin";
    }






}
