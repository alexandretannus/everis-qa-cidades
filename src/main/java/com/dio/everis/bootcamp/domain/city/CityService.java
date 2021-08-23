package com.dio.everis.bootcamp.domain.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CityService {
    
    private CityRepository cityRepository;

    public Page<City> getAllCities(Pageable page) {
        return cityRepository.findAll(page);
    }

    public City getCityById(Long cityId) {
        return cityRepository.findById(cityId).orElseThrow();
    }


}
