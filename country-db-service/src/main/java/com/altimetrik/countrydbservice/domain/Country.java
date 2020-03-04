package com.altimetrik.countrydbservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;


@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String iso2Code;
    private String name;
    private String region;
    private String incomeLevel;
    private String lendingType;
    private String capitalCity;
    private String longitude;
    private String latitude;

    public Country() {
    }

    public Country(String iso2Code, String name, String region, String incomeLevel, String lendingType, String capitalCity, String longitude, String latitude) {
        this.iso2Code = iso2Code;
        this.name = name;
        this.region = region;
        this.incomeLevel = incomeLevel;
        this.lendingType = lendingType;
        this.capitalCity = capitalCity;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIso2Code() {
        return iso2Code;
    }

    public void setIso2Code(String iso2Code) {
        this.iso2Code = iso2Code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getIncomeLevel() {
        return incomeLevel;
    }

    public void setIncomeLevel(String incomeLevel) {
        this.incomeLevel = incomeLevel;
    }

    public String getLendingType() {
        return lendingType;
    }

    public void setLendingType(String lendingType) {
        this.lendingType = lendingType;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return Objects.equals(id, country.id) &&
                Objects.equals(iso2Code, country.iso2Code) &&
                Objects.equals(name, country.name) &&
                Objects.equals(region, country.region) &&
                Objects.equals(incomeLevel, country.incomeLevel) &&
                Objects.equals(lendingType, country.lendingType) &&
                Objects.equals(capitalCity, country.capitalCity) &&
                Objects.equals(longitude, country.longitude) &&
                Objects.equals(latitude, country.latitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, iso2Code, name, region, incomeLevel, lendingType, capitalCity, longitude, latitude);
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", iso2Code='" + iso2Code + '\'' +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", incomeLevel='" + incomeLevel + '\'' +
                ", lendingType='" + lendingType + '\'' +
                ", capitalCity='" + capitalCity + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                '}';
    }
}
