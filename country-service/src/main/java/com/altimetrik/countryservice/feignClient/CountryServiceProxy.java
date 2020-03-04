package com.altimetrik.countryservice.feignClient;


import com.altimetrik.countryservice.domain.CountryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@FeignClient(name = "country-db-service")
public interface CountryServiceProxy {

    @PostMapping(value = "/loadCountryData",produces = {"application/json; charset=UTF-8"})
    List<CountryDTO> loadCountryData(@RequestBody ArrayList<CountryDTO> countryDetails);
    
//    When using @PathVariable for Feign Client, always use value property or
//    it will give you the error java.lang.IllegalStateException: PathVariable annotation was empty on param 0  
    @GetMapping(value ="/getCountryInfo", produces = {"application/json; charset=UTF-8"})
    CountryDTO getCountryInfo(
    		@RequestParam("code") String code,
    		@RequestParam("name") String name,
    		@RequestParam("city") String city);
}
