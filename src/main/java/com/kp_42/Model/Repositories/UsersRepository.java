package com.kp_42.Model.Repositories;

import com.kp_42.Model.Entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<UsersEntity,Integer>{

    public UsersEntity findUserByName(String name);


}
