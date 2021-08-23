package com.dio.everis.bootcamp.domain.country;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "pais")
@Data
public class Country {
    
    @Id
    private Long id;

    @Column(name = "nome")
    private String englishName;
    
    @Column(name = "nome_pt")
    private String portugueseName;

    @Column (name = "sigla")
    private String code;

    @Column(name = "bacen")
    private int bacenNumber;
}