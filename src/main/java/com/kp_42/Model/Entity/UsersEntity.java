package com.kp_42.Model.Entity;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by user on 13.04.2016.
 */
@Entity
@Table(name = "users", schema = "mydb", catalog = "")
public class UsersEntity {
    private int id;


    private String surname;
    private String name;
    private String secondName;
    private WorkplaceEntity workplace;
    private PassportsEntity passport;
    private BirthCertificateEntity birthCertificate;
    private LivingPlaceEntity livingPlace;
    private CriminalActEntity criminalAct;
    private ExtractionEntity extraction;

    @Id
    @GenericGenerator(name="kaugen" , strategy="increment")
    @GeneratedValue(generator="kaugen")
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Surname")
    @NotNull(message = "Введіть Прізвище")
    @Size(min = 1,message = "Введіть Прізвище" )
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "Name")
    @NotNull(message = "Введіть ім'я ")
    @Size(min = 1,message = "Введіть ім'я" )
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SecondName")
    @NotNull(message = "Введіть ім'я по-батькові")
    @Size(min = 1,message = "Введіть ім'я по-батькові" )
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (id != that.id) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (secondName != null ? !secondName.equals(that.secondName) : that.secondName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        return result;
    }

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "workplace_id", referencedColumnName = "id")
    public WorkplaceEntity getWorkplace() {
        return workplace;
    }

    public void setWorkplace(WorkplaceEntity workplace) {
        this.workplace = workplace;
    }

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "passport_id", referencedColumnName = "id")
    public PassportsEntity getPassport() {
        return passport;
    }

    public void setPassport(PassportsEntity passport) {
        this.passport = passport;
    }

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "birthCertificate_id", referencedColumnName = "id")
    public BirthCertificateEntity getBirthCertificate() {
        return birthCertificate;
    }

    public void setBirthCertificate(BirthCertificateEntity birthCertificate) {
        this.birthCertificate = birthCertificate;
    }

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "livingplace_id", referencedColumnName = "id")
    public LivingPlaceEntity getLivingPlace() {
        return livingPlace;
    }

    public void setLivingPlace(LivingPlaceEntity livingPlace) {
        this.livingPlace = livingPlace;
    }

    @OneToOne(mappedBy = "user", cascade = CascadeType.REMOVE)
    public CriminalActEntity getCriminalAct() {
        return criminalAct;
    }

    public void setCriminalAct(CriminalActEntity criminalAct) {
        this.criminalAct = criminalAct;
    }

    @OneToOne(mappedBy = "user", cascade = CascadeType.REMOVE)
    public ExtractionEntity getExtraction() {
        return extraction;
    }

    public void setExtraction(ExtractionEntity extraction) {
        this.extraction = extraction;
    }


    @Override
    public String toString() {
        return "UsersEntity{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
