package com.kp_42.Model.Interface;

import com.kp_42.Model.Entity.*;

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
}
