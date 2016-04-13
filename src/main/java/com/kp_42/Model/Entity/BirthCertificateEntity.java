package com.kp_42.Model.Entity;

import javax.persistence.*;

/**
 * Created by user on 13.04.2016.
 */
@Entity
@Table(name = "birth certificate", schema = "mydb", catalog = "")
public class BirthCertificateEntity {
    private int id;
    private String birthDate;
    private String bitrhPlace;
    private UsersEntity user;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "birthDate")
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "bitrhPlace")
    public String getBitrhPlace() {
        return bitrhPlace;
    }

    public void setBitrhPlace(String bitrhPlace) {
        this.bitrhPlace = bitrhPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BirthCertificateEntity that = (BirthCertificateEntity) o;

        if (id != that.id) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (bitrhPlace != null ? !bitrhPlace.equals(that.bitrhPlace) : that.bitrhPlace != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (bitrhPlace != null ? bitrhPlace.hashCode() : 0);
        return result;
    }

    @OneToOne(mappedBy = "birthCertificate")
    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }
}
