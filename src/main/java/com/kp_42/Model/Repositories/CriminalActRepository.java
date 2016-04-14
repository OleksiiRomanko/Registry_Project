package com.kp_42.Model.Repositories;

import com.kp_42.Model.Entity.CriminalActEntity;
import com.kp_42.Model.Entity.LawEntity;
import com.kp_42.Model.Entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CriminalActRepository extends JpaRepository<CriminalActEntity, Integer> {

    public CriminalActEntity findActByCriminalDescription(String description);
    public List<CriminalActEntity> findByLawContaining(List<LawEntity> law);
    public List<CriminalActEntity> findByUser(UsersEntity entity);

}

