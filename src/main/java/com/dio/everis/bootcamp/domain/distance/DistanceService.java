package com.dio.everis.bootcamp.domain.distance;

import java.util.Arrays;
import java.util.List;

import com.dio.everis.bootcamp.domain.city.City;
import com.dio.everis.bootcamp.domain.city.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DistanceService {
    
    private CityRepository cityRepository;

    public Double getDistanceByPointsInMiles(Long city1, Long city2) {
        //log.info("nativePostgresInMiles({}, {})", city1, city2);
        return cityRepository.distanceByPoints(city1, city2);
      }

    public Double getDistanceByCubeInMeters(Long city1, Long city2) {        
        final List<City> cities = cityRepository.findAllById((Arrays.asList(city1, city2)));

        Point p1 = cities.get(0).getLocation();
        Point p2 = cities.get(1).getLocation();

        return cityRepository.distanceByCube(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
}
