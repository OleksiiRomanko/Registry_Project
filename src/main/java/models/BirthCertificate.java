package models;

import javax.persistence.*;

/**
 * Created by maxymratoshniuk on 3/31/16.
 */
@Entity
@Table(name = "Birth Certificate", schema = "register", catalog = "")
public class BirthCertificate {
    private int id;
    private String birthDate;
    private String bitrhPlace;

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

        BirthCertificate that = (BirthCertificate) o;

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
}
