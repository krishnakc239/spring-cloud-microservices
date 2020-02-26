package com.altimetrik.countrydbservice.repository;

import com.altimetrik.countrydbservice.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
}
