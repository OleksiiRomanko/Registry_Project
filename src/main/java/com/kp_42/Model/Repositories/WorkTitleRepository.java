package com.kp_42.Model.Repositories;

import com.kp_42.Model.Entity.WorktitleEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WorkTitleRepository extends JpaRepository<WorktitleEntity, Integer>{
}
