package com.kp_42.Model.Repositories;

import com.kp_42.Model.Entity.CriminalActEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CriminalActRepository extends JpaRepository<CriminalActEntity, Integer> {
}
