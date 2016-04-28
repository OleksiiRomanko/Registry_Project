package com.kp_42.Model.Interface;

import com.kp_42.Model.Entity.*;

/**
 * Created by user on 14.04.2016.
 */
public interface IDeleteService {

    public void deleteUser(UsersEntity user);
    public void deleteUser(BirthCertificateEntity entity);
    public void deleteUser(PassportsEntity entity);
    public void deleteUser(Integer id);
    public void deleteAct(Integer id);
    public void deleteAct(CriminalActEntity act);
    public void deleteLaw(LawEntity law);


}
