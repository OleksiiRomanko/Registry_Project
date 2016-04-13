package com.kp_42.Model.Interface;

import com.kp_42.Model.Entity.*;

public interface IAdding {

    UsersEntity addUser(String name,
                        String secondName,
                        String sirname,
                        PassportsEntity passport,
                        WorkplaceEntity workPlace,
                        BirthCertificateEntity birthCertificate,
                        LivingPlaceEntity livingPlace);
}
