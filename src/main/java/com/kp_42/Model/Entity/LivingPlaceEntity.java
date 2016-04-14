package com.kp_42.Model.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by user on 13.04.2016.
 */
@Entity
@Table(name = "livingplace", schema = "mydb", catalog = "")
public class LivingPlaceEntity {
    private int id;
    private String country;
    private String region;
    private String city;
    private String district;
    private String house;
    private String flat;
    private UsersEntity user;

    @Id
    @GenericGenerator(name = "kaugen", strategy = "increment")
    @GeneratedValue(generator = "kaugen")
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "country")
    @NotNull(message = "Введіть країну")
    @Size(min = 1,message = "Введіть країну" )
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "region")
    @NotNull(message = "Введіть регіон")
    @Size(min = 1,message = "Введіть регіон" )
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "city")
    @NotNull(message = "Введіть місто")
    @Size(min = 1,message = "Введіть місто" )
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "district")
    @NotNull(message = "Введіть вулицю")
    @Size(min = 1,message = "Введіть вулицю" )
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "house")
    @NotNull(message = "Введіть будинок")
    @Size(min = 1,message = "Введіть будинок" )
    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    @Basic
    @Column(name = "flat")
    @NotNull(message = "Введіть номер квартири")
    @Size(min = 1,message = "Введіть номер квартири" )
    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LivingPlaceEntity that = (LivingPlaceEntity) o;

        if (id != that.id) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (house != null ? !house.equals(that.house) : that.house != null) return false;
        if (flat != null ? !flat.equals(that.flat) : that.flat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (house != null ? house.hashCode() : 0);
        result = 31 * result + (flat != null ? flat.hashCode() : 0);
        return result;
    }

    @OneToOne(mappedBy = "livingPlace", cascade = CascadeType.REMOVE)
    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "LivingPlaceEntity{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", house='" + house + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
