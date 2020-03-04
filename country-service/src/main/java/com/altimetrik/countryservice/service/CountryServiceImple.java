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
    public List<CountryDTO> loadCountryData() {
        ResponseEntity<List<Object>> response = restTemplate.exchange("http://api.worldbank.org/v2/country?format=json", HttpMethod.GET, null, new ParameterizedTypeReference<List<Object>>() {});
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        System.out.println("response from api !!!!!!!!!!!!");
        System.out.println(response);

        List<CountryDetail> responseList = mapper.convertValue(response.getBody().get(1), new TypeReference<List<CountryDetail>>() {});
        System.out.println("response map !!!!!!!!!!!!!");
        System.out.println(responseList);

        ArrayList<CountryDTO> resultList = new ArrayList<>();
        for (CountryDetail cd: responseList) {
            resultList.add(
            		new CountryDTO(cd.getIso2Code(),cd.getName(),
            				cd.getRegion() == null? "": cd.getRegion().getValue()
            				,cd.getIncomeLevelObject() == null? "": cd.getIncomeLevelObject().getValue(),
            						cd.getLendingTypeObject() == null? "": cd.getLendingTypeObject().getValue(),
            				cd.getCapitalCity(), cd.getLongitude(),cd.getLatitude()));
           		
        }
        System.out.println(" result list !!!!!!!!!!");
        System.out.println(resultList);
        List<CountryDTO> returnedList = countryServiceProxy.loadCountryData(resultList);
        if (returnedList == null){
            System.out.println("returned list is null");
        }else {
            System.out.println("returned list .............");
            System.out.println(returnedList);
        }
        return returnedList;
    }

	@Override
	public CountryDTO getCountryInfo(String code, String name, String city) {
		// TODO Auto-generated method stub
		return countryServiceProxy.getCountryInfo(code, name, city);
	}
}
