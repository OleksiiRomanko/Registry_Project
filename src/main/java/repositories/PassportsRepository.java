package repositories;

import models.Passports;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by maxymratoshniuk on 3/31/16.
 */
public interface PassportsRepository extends JpaRepository<Passports, Integer>{
}
