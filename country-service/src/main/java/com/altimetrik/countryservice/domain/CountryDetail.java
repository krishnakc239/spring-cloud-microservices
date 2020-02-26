package com.altimetrik.countryservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class CountryDetail {
    private String id;
    private String iso2Code;
    private String name;
    Region region;
    @JsonIgnore
    Object AdminregionObject;
    IncomeLevel IncomeLevelObject;
    LendingType LendingTypeObject;
    private String capitalCity;
    private String longitude;
    private String latitude;
}
