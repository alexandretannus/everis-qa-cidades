package com.dio.everis.bootcamp.domain.distance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/distances")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DistanceResource {

    private DistanceService distanceService;

    @GetMapping("/by-points")
    public Double getDistanceByPoints(@RequestParam(name = "from") final Long city1,
                           @RequestParam(name = "to") final Long city2) {
      return distanceService.getDistanceByPointsInMiles(city1, city2);
    }

    
    @GetMapping("/by-cube")
    public Double getDistanceByCube(@RequestParam(name = "from") final Long city1,
                           @RequestParam(name = "to") final Long city2) {
      return distanceService.getDistanceByCubeInMeters(city1, city2);
    }
}
