package repositories;

import models.CriminalAct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CriminalActRepository extends JpaRepository<CriminalAct, Integer> {
}

