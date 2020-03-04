package com.altimetrik.countrydbservice.service;

import com.altimetrik.countrydbservice.domain.Country;
import com.altimetrik.countrydbservice.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country save(Country country) {
        return countryRepository.save(country);
    }

	@Override
	public Country findByIso2Code(String code) {
		// TODO Auto-generated method stub
		return countryRepository.findByIso2Code(code);
	}

	@Override
	public Country findByName(String name) {
		// TODO Auto-generated method stub
		return countryRepository.findByName(name);
	}

	@Override
	public Country findByCapitalCity(String city) {
		// TODO Auto-generated method stub
		return countryRepository.findByCapitalCity(city);
	}

	@Override
	public Country findByIso2CodeAndName(String code, String name) {
		// TODO Auto-generated method stub
		return countryRepository.findByIso2CodeAndName(code, name);
	}

	@Override
	public Country findByIso2CodeAndCapitalCity(String code, String city) {
		// TODO Auto-generated method stub
		return countryRepository.findByIso2CodeAndCapitalCity(code, city);
	}

	@Override
	public Country findByNameAndCapitalCity(String name, String city) {
		// TODO Auto-generated method stub
		return countryRepository.findByNameAndCapitalCity(name, city);
	}

	@Override
	public Country findByIso2CodeAndNameAndCapitalCity(String code, String name, String city) {
		// TODO Auto-generated method stub
		return countryRepository.findByIso2CodeAndNameAndCapitalCity(code, name, city);
	}

	@Override
	public List<Country> getAll() {
		return countryRepository.findAll();
	}

}
