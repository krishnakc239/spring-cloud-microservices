package com.altimetrik.countrydbservice.service;

import com.altimetrik.countrydbservice.domain.Country;
import com.altimetrik.countrydbservice.repository.CountryRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class CountryServiceTest {
    Country country;
    @Mock
    CountryRepository repository;
    @InjectMocks
    CountryService countryService = new CountryServiceImpl();

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    void save() {
        country = new Country(1l,"CHN","CN","CHINA","East Asia & Pacific","","","Beijing","40.0495");
        Mockito.when(repository.save(country)).thenReturn(country);
        assertEquals(country,countryService.save(country));
    }
}