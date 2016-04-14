package com.kp_42.Model.Interface;

import com.kp_42.Model.Entity.BirthCertificateEntity;
import com.kp_42.Model.Entity.CriminalActEntity;
import com.kp_42.Model.Entity.PassportsEntity;
import com.kp_42.Model.Entity.UsersEntity;

import java.util.List;

/**
 * Created by user on 14.04.2016.
 */
public interface ISearchService {

    public UsersEntity findUsersByCredentials(String credentials);
    public UsersEntity findUsersByPassport(PassportsEntity entity);
    public UsersEntity findUsersByCertificate(BirthCertificateEntity entity);

    public List<CriminalActEntity> findActsByUsers(UsersEntity user);


}
