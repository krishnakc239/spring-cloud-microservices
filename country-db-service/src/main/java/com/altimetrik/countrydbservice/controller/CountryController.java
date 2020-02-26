package com.altimetrik.countrydbservice.controller;

import com.altimetrik.countrydbservice.domain.Country;
import com.altimetrik.countrydbservice.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping(value = "/loadCountryData",produces = {"application/json; charset=UTF-8"})
    public Boolean save(@RequestBody List<Country> countryList){
        System.out.println("loadCountry data hit in country-db-service !!!!!");
        for (Country c:countryList  ) {
            countryService.save(c);
        }
        System.out.println("data saved!!! ");
        return true;
    }


}
