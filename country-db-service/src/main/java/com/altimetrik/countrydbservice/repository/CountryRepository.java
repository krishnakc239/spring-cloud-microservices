package com.altimetrik.countrydbservice.repository;

import com.altimetrik.countrydbservice.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
	Country findByIso2Code(String code);
	Country findByName(String name);
	Country findByCapitalCity(String city);
	
	Country findByIso2CodeAndName(String code, String name);
	Country findByIso2CodeAndCapitalCity(String code, String city);
	Country findByNameAndCapitalCity(String name,String city);
	Country findByIso2CodeAndNameAndCapitalCity(String code, String name, String city);
}
