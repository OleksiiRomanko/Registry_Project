package com.kp_42.Services;

import com.kp_42.Model.Entity.BirthCertificateEntity;
import com.kp_42.Model.Entity.CriminalActEntity;
import com.kp_42.Model.Entity.PassportsEntity;
import com.kp_42.Model.Entity.UsersEntity;
import com.kp_42.Model.Interface.ISearchService;
import com.kp_42.Model.Repositories.*;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by user on 14.04.2016.
 */

@Named("SearchService")
public class SearchServiceImpl implements ISearchService {


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
    public UsersEntity findUsersByCredentials(String credentials) {
        return null;
    }

    @Override
    public UsersEntity findUsersByPassport(PassportsEntity entity) {
        return usersRepository.findByPassport(entity);
    }

    @Override
    public UsersEntity findUsersByCertificate(BirthCertificateEntity entity) {
        return usersRepository.findByBirthCertificate(entity);
    }

    @Override
    public List<CriminalActEntity> findActsByUsers(UsersEntity user) {
        return actRepository.findByUser(user);
    }
}
