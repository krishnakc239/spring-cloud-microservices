package com.altimetrik.countrydbservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Country {
    @Id
    private String id;
    private String iso2Code;
    private String name;
    private String region;
    private String incomeLevel;
    private String lendingType;
    private String capitalCity;
    private String longitude;
    private String latitude;
}
