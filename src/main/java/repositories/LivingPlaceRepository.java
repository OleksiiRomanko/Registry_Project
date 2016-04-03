package repositories;

import models.LivingPlace;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by maxymratoshniuk on 3/31/16.
 */
public interface LivingPlaceRepository extends JpaRepository<LivingPlace, Integer> {
}
