package com.altimetrik.countrydbservice.service;

import com.altimetrik.countrydbservice.domain.Country;
import com.altimetrik.countrydbservice.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }
}
