package com.altimetrik.countryservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryDTO {
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
