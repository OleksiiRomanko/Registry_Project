package com.kp_42.Model.Interface;

import com.kp_42.Model.Entity.*;

import javax.xml.registry.infomodel.User;
import java.util.List;

/**
 * Created by user on 14.04.2016.
 */
public interface ISearchService {

    public List<UsersEntity> findUsersByCredentials(String credentials);
    public UsersEntity findUsersByPassport(PassportsEntity entity);
    public UsersEntity findUsersByCertificate(BirthCertificateEntity entity);
    public UsersEntity findUser(Integer id);
    public CriminalActEntity findActByUser(UsersEntity user);
    public CriminalActEntity findAct(Integer id);
    public LawEntity findLaw(Integer id);
    public List<LawEntity> getAllLaws();
    public List<UsersEntity> getAllUsers();
}
