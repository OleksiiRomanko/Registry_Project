package com.kp_42.Model.Interface;

import com.kp_42.Model.Entity.*;

import java.util.List;

public interface IPersistService {

    UsersEntity addUser(String name,
                        String secondName,
                        String sirname,
                        PassportsEntity passport,
                        WorkplaceEntity workPlace,
                        BirthCertificateEntity birthCertificate,
                        LivingPlaceEntity livingPlace);

    public UsersEntity save(UsersEntity user);
    public CriminalActEntity save(CriminalActEntity act);
    public ExtractionEntity save (ExtractionEntity extractionEntity);
    public List<LawEntity> save(List<LawEntity> law);


}
