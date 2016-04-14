package com.kp_42.Model.Repositories;

import com.kp_42.Model.Entity.PassportsEntity;
import com.kp_42.Model.Entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by maxymratoshniuk on 3/31/16.
 */
public interface PassportsRepository extends JpaRepository<PassportsEntity, Integer>{


    public PassportsEntity findByNumberAndSeries(Integer Number,String Series);
    public PassportsEntity findByUser(UsersEntity user);


}
