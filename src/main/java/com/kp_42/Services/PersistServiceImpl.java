package com.kp_42.Services;


import com.kp_42.Model.Entity.*;
import com.kp_42.Model.Interface.IPersistService;
import com.kp_42.Model.Repositories.*;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named("PersistService")
public class PersistServiceImpl implements IPersistService {

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

    @Override
    public UsersEntity save(UsersEntity user) {
        return usersRepository.save(user);
    }

    @Override
    public CriminalActEntity save(CriminalActEntity act) {
        return actRepository.save(act);
    }

    @Override
    public List<LawEntity> save(List<LawEntity> law) {
        return lawRepository.save(law);
    }

    @Override
    public ExtractionEntity save(ExtractionEntity extractionEntity) {
        return extractionRepository.saveAndFlush(extractionEntity);
    }

    @Override
    public LawEntity save(LawEntity lawEntity) {
        return lawRepository.save(lawEntity);
    }
}
