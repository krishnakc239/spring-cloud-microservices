package com.altimetrik.countryservice.service;

import com.altimetrik.countryservice.domain.CountryDTO;
import com.altimetrik.countryservice.domain.CountryDetail;
import com.altimetrik.countryservice.feignClient.CountryServiceProxy;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryServiceImple implements CountryService {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    CountryServiceProxy countryServiceProxy;

    @Override
    public boolean loadCountryData() {
        ResponseEntity<List<Object>> response = restTemplate.exchange("http://api.worldbank.org/v2/country?format=json", HttpMethod.GET, null, new ParameterizedTypeReference<List<Object>>() {});
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        System.out.println("response from api !!!!!!!!!!!!");
        System.out.println(response);

        List<CountryDetail> responseList = mapper.convertValue(response.getBody().get(1), new TypeReference<List<CountryDetail>>() {});
        System.out.println("response map !!!!!!!!!!!!!");
        System.out.println(responseList);

        ArrayList<CountryDTO> resultList = new ArrayList<>();
        CountryDetail c = new CountryDetail();
        for (CountryDetail cd: responseList) {
            resultList.add(
                    new CountryDTO(
                            cd.getId(),
                            cd.getIso2Code(),
                            cd.getName(),
                            cd.getRegion().getValue(),
                            cd.getIncomeLevelObject() ==null ? "":cd.getIncomeLevelObject().getValue() ,
                            cd.getLendingTypeObject() == null? "": cd.getLendingTypeObject().getValue(),
                            cd.getCapitalCity(),
                            cd.getLatitude(),
                            cd.getLongitude()));
        }

        return countryServiceProxy.loadCountryData(resultList);
    }
}
