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
import javax.validation.Valid;

/**
 * Created by user on 28.04.2016.
 */

@Controller
@RequestMapping("/admin/user")
@SessionAttributes(value = {"UsersEntity",
        "PassportsEntity",
        "BirthCertificateEntity",
        "LivingPlaceEntity",
        "WorkPlaceEntity"})
public class UserEditController {
    @Inject
    @Named("PersistService")
    private IPersistService persistService;
    @Inject
    @Named("SearchService")
    private ISearchService searchService;

    @Inject
    @Named("DeleteService")
    private IDeleteService deleteService;


    @RequestMapping(value = "/{id}/edit/info", method = RequestMethod.GET)
    public String getEditInfo(ModelMap map, @PathVariable Integer id) {
        UsersEntity user = searchService.findUser(id);
        map.addAttribute("UsersEntity",user);
        return "EntityEditing/UserEditing/EditUserPages/personalinformation";
    }

    @RequestMapping(value = "/{id}/edit/info", method = RequestMethod.POST)
    public String editInfo(ModelMap map, @PathVariable Integer id, @Valid @ModelAttribute("UsersEntity") UsersEntity user,
                           BindingResult result,SessionStatus status) {

        if(result.hasErrors())return "EntityEditing/UserEditing/EditUserPages/personalinformation";
        UsersEntity updateUser = searchService.findUser(id);
        updateUser.setName(user.getName());
        updateUser.setSecondName(user.getSecondName());
        updateUser.setSurname(user.getSurname());
        persistService.save(updateUser);
        status.setComplete();

        return "EntityEditing/UserEditing/EditUserPages/personalinformation";
    }

    @RequestMapping(value = "/{id}/edit/passport", method = RequestMethod.GET)
    public String getEditPassport(ModelMap map, @PathVariable Integer id) {
        UsersEntity user = searchService.findUser(id);
        map.addAttribute("UsersEntity",user);
        map.addAttribute("PassportsEntity",user.getPassport());
        return "EntityEditing/UserEditing/EditUserPages/passport";
    }

    @RequestMapping(value = "/{id}/edit/passport", method = RequestMethod.POST)
    public String editPassport(ModelMap map, @PathVariable Integer id, @Valid @ModelAttribute("PassportsEntity") PassportsEntity passport,
                               BindingResult result,SessionStatus status) {

        if(result.hasErrors())return "EntityEditing/UserEditing/EditUserPages/passport";
        UsersEntity user =  searchService.findUser(id);
        PassportsEntity passportUpdate = user.getPassport();
        passportUpdate.setNumber(passport.getNumber());
        passportUpdate.setAuthor(passport.getAuthor());
        passportUpdate.setBirthDate(passport.getBirthDate());
        passportUpdate.setBirthPlace(passport.getBirthPlace());
        passportUpdate.setDate(passport.getDate());
        passportUpdate.setSeries(passport.getSeries());
        persistService.save(user);
        status.setComplete();
        return "EntityEditing/UserEditing/EditUserPages/passport";
    }

    @RequestMapping(value = "/{id}/edit/certificate", method = RequestMethod.GET)
    public String getEditCertificate(ModelMap map, @PathVariable Integer id) {
        UsersEntity user = searchService.findUser(id);
        map.addAttribute("UsersEntity",user);
        map.addAttribute("BirthCertificateEntity",user.getBirthCertificate());
        return "EntityEditing/UserEditing/EditUserPages/certificate";
    }

    @RequestMapping(value = "/{id}/edit/certificate", method = RequestMethod.POST)
    public String editCertificate(ModelMap map, @PathVariable Integer id,
                                  @Valid @ModelAttribute("BirthCertificateEntity") BirthCertificateEntity certificate,
                               BindingResult result,SessionStatus status) {

        if(result.hasErrors())return "EntityEditing/UserEditing/EditUserPages/certificate";
        UsersEntity user =  searchService.findUser(id);
        BirthCertificateEntity update = user.getBirthCertificate();
        update.setBitrhPlace(certificate.getBitrhPlace());
        update.setBirthDate(certificate.getBirthDate());

        persistService.save(user);
        status.setComplete();

        return "EntityEditing/UserEditing/EditUserPages/certificate";
    }


    @RequestMapping(value = "/{id}/edit/livingplace", method = RequestMethod.GET)
    public String getEditLivingPlace(ModelMap map, @PathVariable Integer id) {
        UsersEntity user = searchService.findUser(id);
        map.addAttribute("UsersEntity",user);
        map.addAttribute("LivingPlaceEntity",user.getLivingPlace());
        return "EntityEditing/UserEditing/EditUserPages/livingplace";
    }

    @RequestMapping(value = "/{id}/edit/livingplace", method = RequestMethod.POST)
    public String editLivingPlace(ModelMap map, @PathVariable Integer id,
                                  @Valid @ModelAttribute("LivingPlaceEntity") LivingPlaceEntity livingPlace,
                                  BindingResult result,SessionStatus status) {

        if(result.hasErrors())return "EntityEditing/UserEditing/EditUserPages/livingplace";
        UsersEntity user =  searchService.findUser(id);
        LivingPlaceEntity entity = user.getLivingPlace();
        entity.setCity(livingPlace.getCity());
        entity.setCountry(livingPlace.getCountry());
        entity.setDistrict(livingPlace.getDistrict());
        entity.setFlat(livingPlace.getFlat());
        entity.setHouse(livingPlace.getHouse());
        entity.setRegion(livingPlace.getRegion());
        persistService.save(user);
        status.setComplete();
        return "EntityEditing/UserEditing/EditUserPages/livingplace";
    }

    @RequestMapping(value = "/{id}/edit/workplace", method = RequestMethod.GET)
    public String getEditWorkplace(ModelMap map, @PathVariable Integer id) {
        UsersEntity user = searchService.findUser(id);
        map.addAttribute("UsersEntity",user);
        map.addAttribute("WorkPlaceEntity",user.getWorkplace());
        return "EntityEditing/UserEditing/EditUserPages/workplace";
    }

    @RequestMapping(value = "/{id}/edit/workplace", method = RequestMethod.POST)
    public String editWorkplace(ModelMap map, @PathVariable Integer id,
                                @Valid @ModelAttribute("WorkPlaceEntity") WorkplaceEntity workplace,
                                BindingResult result, SessionStatus status) {

        if(result.hasErrors())return "EntityEditing/UserEditing/EditUserPages/workplace";
        UsersEntity user =  searchService.findUser(id);
        WorkplaceEntity place = user.getWorkplace();
        place.setWorkplaceName(workplace.getWorkplaceName());
        place.setWorksphere(workplace.getWorksphere());
        place.setWorktitle(workplace.getWorktitle());
        place.setAdress(workplace.getAdress());
        persistService.save(user);
        status.setComplete();
        return "EntityEditing/UserEditing/EditUserPages/workplace";
    }
}
