package repositories;

import models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UsersRepository extends JpaRepository<Users,Integer>{
    @Query("select u from Users u where u.name = :name")
    Users findByName(@Param("name") String name);
}
