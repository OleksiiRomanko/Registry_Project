package com.kp_42.Services;

import com.kp_42.Model.Entity.*;
import com.kp_42.Model.Interface.ISearchService;
import com.kp_42.Model.Repositories.*;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    public List<UsersEntity> findUsersByCredentials(String credentials) {

        List<UsersEntity> result =  new ArrayList<>();
        String [] arr = credentials.split(" ");
        if(arr.length != 3)return null;
        System.out.println(arr[0] + " " + arr[1] + " " +arr[2]);
        result.addAll(usersRepository.findBySurnameLike(arr[0]));
        result = result.stream()
                .filter(usersEntity -> usersEntity.getName().contains(arr[1]))
                .filter(usersEntity1 -> usersEntity1.getSecondName().contains(arr[2]))
                .distinct().collect(Collectors.toList());
        return result;

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

    @Override
    public List<LawEntity> getAllLaws() {
        return lawRepository.findAll();
    }

    @Override
    public UsersEntity findUser(Integer id) {
        return usersRepository.findOne(id);
    }

    @Override
    public LawEntity findLaw(Integer id) {
        return lawRepository.findOne(id);
    }
}
