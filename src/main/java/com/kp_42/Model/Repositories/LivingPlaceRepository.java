package com.kp_42.Model.Repositories;

import com.kp_42.Model.Entity.LivingPlaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by maxymratoshniuk on 3/31/16.
 */
public interface LivingPlaceRepository extends JpaRepository<LivingPlaceEntity, Integer> {
}
