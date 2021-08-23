package com.dio.everis.bootcamp.domain.city;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dio.everis.bootcamp.domain.point.PointType;
import com.dio.everis.bootcamp.domain.state.State;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.springframework.data.geo.Point;

import lombok.Data;

@Entity
@Table(name = "cidade")
@Data
@TypeDefs(value = {
    @TypeDef(name = "point", typeClass = PointType.class)
})
public class City {
    
    @Id
    private Long id;

    @Column(name = "nome")
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "uf", referencedColumnName = "id")
    private State state;

    private Integer ibge;

    @Column(name = "lat_lon")
    private String geolocation;
     
    @Type(type = "point")
    @Column(name = "lat_lon", updatable = false, insertable = false)
    private Point location;
}
