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
@Table(name = "passports", schema = "mydb", catalog = "")
public class PassportsEntity {
    private int id;
    private String series;
    private Integer number;
    private Long date;
    private String author;
    private Long birthDate;
    private String birthPlace;
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
    @Column(name = "series")
    @NotNull(message = "Введіть серію паспорту")
    @Size(min = 2,max = 2,message = "Введіть серію паспорту(2 букви)" )
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Basic
    @Column(name = "number")
    @NotNull(message = "Введіть номер паспорту")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Basic
    @Column(name = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Виберіть дату")

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    @Basic
    @Column(name = "author")
    @NotNull(message = "Введіть назву організації, яка видала паспорт")
    @Size(min = 1,message = "Введіть назву організації, яка видала паспорт" )
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "birthDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Виберіть дату")
    public Long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Long birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "birthPlace")
    @NotNull(message = "Введіть міце народження")
    @Size(min = 1,message = "Введіть міце народження" )
    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PassportsEntity that = (PassportsEntity) o;

        if (id != that.id) return false;
        if (series != null ? !series.equals(that.series) : that.series != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (birthPlace != null ? !birthPlace.equals(that.birthPlace) : that.birthPlace != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (series != null ? series.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (birthPlace != null ? birthPlace.hashCode() : 0);
        return result;
    }

    @OneToOne(mappedBy = "passport", cascade = CascadeType.REMOVE)
    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }


    @Override
    public String toString() {
        return "PassportsEntity{" +
                "series='" + series + '\'' +
                ", number=" + number +
                ", date=" + date +
                ", author='" + author + '\'' +
                ", birthDate=" + birthDate +
                ", birthPlace='" + birthPlace + '\'' +
                '}';
    }
}
