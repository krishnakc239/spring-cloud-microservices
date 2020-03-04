package com.altimetrik.countrydbservice.controller;

import com.altimetrik.countrydbservice.domain.Country;
import com.altimetrik.countrydbservice.service.CountryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping(value = "/loadCountryData",produces = {"application/json; charset=UTF-8"})
    public List<Country> save(@RequestBody List<Country> countryList){
        System.out.println("loadCountry data hit in country-db-service !!!!!");
		System.out.println("countryList in db.........");
		System.out.println(countryList);
        for (Country c:countryList  ) {
            countryService.save(c);
        }
        System.out.println("data saved!!! ");
        System.out.println("saved data.............");
        System.out.println(countryService.getAll());
        return countryService.getAll();
    }
    
    @GetMapping(value ="/getCountryInfo", produces = {"application/json; charset=UTF-8"})
    Country getCountryInfo(
    		@RequestParam String code,
    		@RequestParam String name,
    		@RequestParam String city) {
    	System.out.println(" country db service hit wiht paramters :"+ code +", "+ name+", "+ city);
    	if(!code.equals("") && !name.equals("") && !city.equals("")) {
    		System.out.println(" code name city mehtod called!!from country -db -service");
    		return countryService.findByIso2CodeAndNameAndCapitalCity(code, name, city);
    	}else if(!code.equals("") && !name.equals("") && city.equals("")) {
    		return countryService.findByIso2CodeAndName(code, name);
    	} else if(!code.equals("") && name.equals("") && city.equals("")) {
    		return countryService.findByIso2Code(code);
    	}else if(code.equals("") && !name.equals("") && !city.equals("")) {
    		return countryService.findByNameAndCapitalCity(name, city);
    	}else if(code.equals("") && name.equals("") && !city.equals("")) {
            System.out.println("capital city case called !!!!");
    		return countryService.findByCapitalCity(city);
    	}else if(code.equals("") && !name.equals("") && city.equals("")) {
    		System.out.println("find by name called with anme: "+ name);
            System.out.println("result : "+ countryService.findByName(name));
    		return countryService.findByName(name);
    	}else {
    		return new Country();
    	}
    	
    }


}
