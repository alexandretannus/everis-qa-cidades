package com.dio.everis.bootcamp.domain.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/countries")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryResource {
    
    private CountryService countryService;

    @GetMapping
    public Page<Country> getAllCountries(Pageable page) {
        return countryService.getAllCountries(page);
    }

    @GetMapping("/{countryId}")
    public Country getCountryById(@PathVariable Long countryId ) {
        return countryService.getCountryById(countryId);
    }
}
