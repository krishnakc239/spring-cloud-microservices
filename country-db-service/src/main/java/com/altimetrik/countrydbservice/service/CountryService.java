package com.altimetrik.countrydbservice.service;

import com.altimetrik.countrydbservice.domain.Country;

import java.util.List;

public interface CountryService {

    Country  save(Country country);
	Country findByIso2Code(String code);
	Country findByName(String name);
	Country findByCapitalCity(String city);
	
	Country findByIso2CodeAndName(String code, String name);
	Country findByIso2CodeAndCapitalCity(String code, String city);
	Country findByNameAndCapitalCity(String name,String city);
	Country findByIso2CodeAndNameAndCapitalCity(String code, String name, String city);
	List<Country> getAll();
}
