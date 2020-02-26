package com.altimetrik.countryservice.feignClient;


import com.altimetrik.countryservice.domain.CountryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@FeignClient(name = "country-db-service")
public interface CountryServiceProxy {

    @PostMapping(value = "/loadCountryData",produces = {"application/json; charset=UTF-8"})
    Boolean loadCountryData(@RequestBody ArrayList<CountryDTO> countryDetails);
}
