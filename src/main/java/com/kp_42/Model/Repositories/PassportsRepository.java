package com.kp_42.Model.Repositories;

import com.kp_42.Model.Entity.PassportsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by maxymratoshniuk on 3/31/16.
 */
public interface PassportsRepository extends JpaRepository<PassportsEntity, Integer>{
}
