package com.github.carvalhobruno.citiesapi.countries.repository;

import com.github.carvalhobruno.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
