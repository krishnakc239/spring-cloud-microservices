package com.altimetrik.countryservice.service;

import com.altimetrik.countryservice.domain.CountryDTO;

import java.util.List;

public interface CountryService {
    public List<CountryDTO> loadCountryData();
    public CountryDTO getCountryInfo(String code, String name, String city);
}
