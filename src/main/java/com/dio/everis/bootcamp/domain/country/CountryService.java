package com.dio.everis.bootcamp.domain.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryService {
    
    private CountryRepository countryRepository;

    public Page<Country> getAllCountries(Pageable page) {
        return countryRepository.findAll(page);
    }

    public Country getCountryById(Long id) {

        // TODO: CREATE ERROR HANDLER
        return countryRepository.findById(id).orElseThrow(null);        
    }

}
