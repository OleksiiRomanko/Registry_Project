package com.kp_42.Model.Entity;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by user on 13.04.2016.
 */
@Entity
@Table(name = "birthcertificate", schema = "mydb", catalog = "")
public class BirthCertificateEntity {
    private int id;
    private Long birthDate;
    private String bitrhPlace;
    private UsersEntity user;

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
    @Column(name = "birthDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Виберіть дату ")
    public Long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "bitrhPlace")
    @NotNull(message = "Введіть міце народження")
    @Size(min = 1,message = "Введіть міце народження" )
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

    @OneToOne(mappedBy = "birthCertificate",cascade = CascadeType.REMOVE)
    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "BirthCertificateEntity{" +
                "birthDate=" + birthDate +
                ", bitrhPlace='" + bitrhPlace + '\'' +
                '}';
    }
}
