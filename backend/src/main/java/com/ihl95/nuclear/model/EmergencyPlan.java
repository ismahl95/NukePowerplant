package com.ihl95.nuclear.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class EmergencyPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;              // Nombre
    private String description;       // Descripción
    private LocalDateTime creationDate; // Fecha de creación

    @ManyToOne
    @JoinColumn(name = "nuclear_plant_id")
    private NuclearPlant nuclearPlant; // Relación con PlantaNuclear
}
