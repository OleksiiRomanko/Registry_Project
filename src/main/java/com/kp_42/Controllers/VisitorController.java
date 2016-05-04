package com.kp_42.Controllers;

import com.kp_42.Model.Entity.ExtractionEntity;
import com.kp_42.Model.Entity.LawEntity;
import com.kp_42.Model.Entity.UsersEntity;
import com.kp_42.Model.Interface.IDeleteService;
import com.kp_42.Model.Interface.IPersistService;
import com.kp_42.Model.Interface.ISearchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("mainpage/")
public class VisitorController {

    @Inject
    @Named("PersistService")
    private IPersistService persistService;
    @Inject
    @Named("SearchService")
    private ISearchService searchService;

    @Inject
    @Named("DeleteService")
    private IDeleteService deleteService;


    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public String getSearchingResult(ModelMap map, @RequestParam("credentials") String credentials) {

        try {

            if (credentials.length() == 0)
                return "redirect:/mainpage";

            List<UsersEntity> users = searchService.findUsersByCredentials(credentials);

            if (users.size() == 0)
                return "redirect:/mainpage";

            map.addAttribute("users", users);
            return "resultpage";

        } catch (NullPointerException e) {

            return "redirect:/mainpage";
        }

    }

    @RequestMapping(value = "/{id}/extraction", method = RequestMethod.GET)
    public String getUserExtraction(ModelMap map, @PathVariable Integer id) {

        ExtractionEntity extract = new ExtractionEntity();
        extract.setUser(searchService.findUser(id));
        extract.setCriminalAct(extract.getUser().getCriminalAct());
        extract.setSourceInformation("Державний реєстр корупціонерів");
        map.addAttribute("extract", extract);

        return "extraction";

    }

    @RequestMapping(value = "/goback", method = RequestMethod.GET)
    public String goToMain(ModelMap map) {
        return "redirect:/mainpage";
    }

}
