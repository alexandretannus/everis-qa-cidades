package com.dio.everis.bootcamp.domain.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/cities")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CityResource {
    
    private CityService cityService;

    @GetMapping
    public Page<City> getAllCities(Pageable page) {
        return cityService.getAllCities(page);
    }

    @GetMapping("/{cityId}")
    public City getCityById(@PathVariable Long cityId) {
        return cityService.getCityById(cityId);
    }
}
