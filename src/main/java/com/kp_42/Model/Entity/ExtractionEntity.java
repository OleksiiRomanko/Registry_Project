package com.kp_42.Model.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 13.04.2016.
 */
@Entity
@Table(name = "extraction", schema = "mydb", catalog = "")
public class ExtractionEntity {
    private int id;
    private String number;
    private Long date;
    private Integer isPresent;
    private String sourceInformation;
    private List<CriminalActEntity> criminalAct;
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
    @Column(name = "number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Basic
    @Column(name = "date")
    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    @Basic
    @Column(name = "isPresent")
    public Integer getIsPresent() {
        return isPresent;
    }

    public void setIsPresent(Integer isPresent) {
        this.isPresent = isPresent;
    }

    @Basic
    @Column(name = "sourceInformation")
    public String getSourceInformation() {
        return sourceInformation;
    }

    public void setSourceInformation(String sourceInformation) {
        this.sourceInformation = sourceInformation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExtractionEntity that = (ExtractionEntity) o;

        if (id != that.id) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (isPresent != null ? !isPresent.equals(that.isPresent) : that.isPresent != null) return false;
        if (sourceInformation != null ? !sourceInformation.equals(that.sourceInformation) : that.sourceInformation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (isPresent != null ? isPresent.hashCode() : 0);
        result = 31 * result + (sourceInformation != null ? sourceInformation.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "extraction")
    public List<CriminalActEntity> getCriminalAct() {
        return criminalAct;
    }

    public void setCriminalAct(List<CriminalActEntity> criminalAct) {
        this.criminalAct = criminalAct;
    }

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }
}
