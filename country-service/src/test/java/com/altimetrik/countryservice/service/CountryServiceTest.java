package com.altimetrik.countryservice.service;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
class CountryServiceTest {

    @Mock
    CountryService countryService = new CountryServiceImple();

    @Before
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testLoadCountryData() {
        Mockito.when(countryService.loadCountryData()).thenReturn(true);
        assertTrue(countryService.loadCountryData());
    }
}