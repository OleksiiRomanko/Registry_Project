package com.kp_42.Model.Interface;

import com.kp_42.Model.Entity.BirthCertificateEntity;
import com.kp_42.Model.Entity.CriminalActEntity;
import com.kp_42.Model.Entity.PassportsEntity;
import com.kp_42.Model.Entity.UsersEntity;

/**
 * Created by user on 14.04.2016.
 */
public interface IDeleteService {

    public void deleteUser(UsersEntity user);
    public void deleteUser(BirthCertificateEntity entity);
    public void deleteUser(PassportsEntity entity);

    public void deleteAct(Integer id);
    public void deleteAct(CriminalActEntity act);


}
