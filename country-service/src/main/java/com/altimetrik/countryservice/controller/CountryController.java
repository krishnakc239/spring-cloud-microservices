package com.altimetrik.countryservice.controller;

import com.altimetrik.countryservice.domain.CountryDTO;
import com.altimetrik.countryservice.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    CountryService countryService;

    @GetMapping("/loadData")
    public List<CountryDTO> loadData(){
        System.out.println("request come to country-service controller");
        return countryService.loadCountryData();
    }
    @GetMapping(value ="/getCountryInfo", produces = {"application/json; charset=UTF-8"})
    public CountryDTO getCountryInfo(
    		@RequestParam String code,
    		@RequestParam String name,
    		@RequestParam String city) {
    	System.out.println("country service hit wiht params :"+ code+", "+ name +", "+city+" : "+countryService.getCountryInfo(code,name,city));
    	return countryService.getCountryInfo(code,name,city);
    	}
   
}
