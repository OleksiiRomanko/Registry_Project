package com.kp_42.Services;


import com.kp_42.Model.Entity.*;
import com.kp_42.Model.Interface.IAddService;
import com.kp_42.Model.Repositories.*;

import javax.inject.Inject;
import javax.inject.Named;

@Named("AddService")
public class AddServiceImpl implements IAddService {

    @Inject
    private CriminalActRepository criminalActRepository;
    @Inject
    private BirthCertificateRepository birthCertificateRepository;
    @Inject
    private CriminalActRepository actRepository;
    @Inject
    private ExtractionRepository extractionRepository;
    @Inject
    private LawRepository lawRepository;
    @Inject
    private LivingPlaceRepository livingPlaceRepository;
    @Inject
    private PassportsRepository passportsRepository;
    @Inject
    private UsersRepository usersRepository;
    @Inject
    private WorkPlaceRepository workPlaceRepository;
    @Inject
    private WorkTitleRepository workTitleRepository;

    @Override
    public UsersEntity addUser(String name, String secondName, String sirname,
                                   PassportsEntity passport, WorkplaceEntity workPlace,
                                   BirthCertificateEntity birthCertificate,
                                   LivingPlaceEntity livingPlace) {

        UsersEntity user = new UsersEntity();
        user.setName(name);
        user.setSecondName(secondName);
        user.setSurname(sirname);
        user.setWorkplace(workPlace);
        user.setBirthCertificate(birthCertificate);
        user.setLivingPlace(livingPlace);
        user.setPassport(passport);

        user = usersRepository.save(user);

        return user;
    }
}