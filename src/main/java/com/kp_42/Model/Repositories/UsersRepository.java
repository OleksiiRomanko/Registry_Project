package com.kp_42.Model.Repositories;

import com.kp_42.Model.Entity.BirthCertificateEntity;
import com.kp_42.Model.Entity.PassportsEntity;
import com.kp_42.Model.Entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public interface UsersRepository extends JpaRepository<UsersEntity,Integer>{

    class UserCriteria{
        String name,surname,series;
        Integer number;

        public UserCriteria(String name, String surname, String series, Integer number) {
            this.name = name;
            this.surname = surname;
            this.series = series;
            this.number = number;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getSeries() {
            return series;
        }

        public void setSeries(String series) {
            this.series = series;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<UsersEntity> filter(List<UsersEntity> users){
            return users.stream()
                    .filter( obj -> name == null || obj.getName().contains(name))
                    .filter( obj -> surname == null || obj.getSurname().contains(surname))
                    .filter( obj -> series == null || obj.getPassport().getSeries().contains(series))
                    .filter( obj -> number == null || obj.getPassport().getNumber().toString().contains(number.toString()))
                    .collect(Collectors.toList());

        }
    }

    public UsersEntity findByName(String name);
    public List<UsersEntity> findByNameLike(String name);
    public List<UsersEntity> findBySurnameLike(String name);
    public List<UsersEntity> findBySecondNameLike(String name);
    public UsersEntity findByPassport(PassportsEntity entity);
    public UsersEntity findByBirthCertificate(BirthCertificateEntity entity);
}
