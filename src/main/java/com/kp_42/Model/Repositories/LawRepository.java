package com.kp_42.Model.Repositories;

import com.kp_42.Model.Entity.LawEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawRepository extends JpaRepository<LawEntity, Integer>{
}
