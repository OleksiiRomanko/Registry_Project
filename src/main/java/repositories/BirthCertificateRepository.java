package repositories;

import models.BirthCertificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BirthCertificateRepository extends JpaRepository<BirthCertificate, Integer> {

}