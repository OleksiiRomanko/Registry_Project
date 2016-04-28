package com.kp_42.Services;

import com.kp_42.Model.Entity.*;
import com.kp_42.Model.Interface.IDeleteService;
import com.kp_42.Model.Repositories.*;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by user on 14.04.2016.
 */

@Named("DeleteService")
public class DeleteServiceImpl implements IDeleteService {


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
    public void deleteUser(UsersEntity user) {
        usersRepository.delete(user);
    }

    @Override
    public void deleteUser(Integer id) {
        usersRepository.delete(id);
    }

    @Override
    public void deleteUser(BirthCertificateEntity entity) {
        birthCertificateRepository.delete(entity);
    }

    @Override
    public void deleteUser(PassportsEntity entity) {
        passportsRepository.delete(entity);
    }

    @Override
    public void deleteAct(Integer id) {
        actRepository.delete(id);
    }

    @Override
    public  void deleteLaw(LawEntity law) { lawRepository.delete(law); }


    @Override
    public void deleteAct(CriminalActEntity act) {
        actRepository.delete(act);
    }


}
