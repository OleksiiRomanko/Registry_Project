package models;

import javax.persistence.*;

/**
 * Created by maxymratoshniuk on 3/31/16.
 */
@Entity
@Table(name = "Extraction", schema = "register", catalog = "")
public class Extraction {
    private int id;
    private String number;
    private String date;
    private Integer isPresent;
    private String sourceInformation;

    @Id
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
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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

        Extraction that = (Extraction) o;

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
}
