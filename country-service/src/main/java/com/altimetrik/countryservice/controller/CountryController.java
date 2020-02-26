package com.altimetrik.countryservice.controller;

import com.altimetrik.countryservice.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountryController {

    @Autowired
    CountryService countryService;

    @RequestMapping("/loadData")
    public Boolean loadData(){
        System.out.println("request come to country-service controller");
        return countryService.loadCountryData();
    }
}
