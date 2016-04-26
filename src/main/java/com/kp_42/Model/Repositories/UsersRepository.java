package com.kp_42.Model.Repositories;

import com.kp_42.Model.Entity.BirthCertificateEntity;
import com.kp_42.Model.Entity.PassportsEntity;
import com.kp_42.Model.Entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UsersRepository extends JpaRepository<UsersEntity,Integer>{

    public UsersEntity findByName(String name);
    public List<UsersEntity> findByNameLike(String name);
    public List<UsersEntity> findBySurnameLike(String name);
    public List<UsersEntity> findBySecondNameLike(String name);
    public UsersEntity findByPassport(PassportsEntity entity);
    public UsersEntity findByBirthCertificate(BirthCertificateEntity entity);

}
