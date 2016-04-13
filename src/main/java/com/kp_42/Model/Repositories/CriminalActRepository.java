package com.kp_42.Model.Repositories;

import com.kp_42.Model.Entity.CriminalActEntity;
import com.kp_42.Model.Entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CriminalActRepository extends JpaRepository<CriminalActEntity, Integer> {

    public CriminalActEntity findActByCriminalDescription(String description);
    public void deleteActByUser(UsersEntity user);
}

