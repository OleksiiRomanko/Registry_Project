package com.kp_42.Model.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * Created by user on 13.04.2016.
 */
@Entity
@Table(name = "law", schema = "mydb", catalog = "")
public class LawEntity {
    private int id;
    private String name;
    private String type;
    private List<CriminalActEntity> criminalAct;

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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LawEntity lawEntity = (LawEntity) o;

        if (id != lawEntity.id) return false;
        if (name != null ? !name.equals(lawEntity.name) : lawEntity.name != null) return false;
        if (type != null ? !type.equals(lawEntity.type) : lawEntity.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }


    @ManyToMany(mappedBy = "law")
    public List<CriminalActEntity> getCriminalAct() {
        return criminalAct;
    }

    public void setCriminalAct(List<CriminalActEntity> criminalAct) {
        this.criminalAct = criminalAct;
    }


}
