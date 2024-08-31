package com.ihl95.nuclear.nuclearPlant.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ihl95.nuclear.emergencyPlan.domain.EmergencyPlan;
import com.ihl95.nuclear.incident.domain.Incident;
import com.ihl95.nuclear.maintenancePlan.domain.MaintenancePlan;
import com.ihl95.nuclear.operator.domain.Operator;
import com.ihl95.nuclear.reactor.domain.Reactor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor // Genera un constructor sin argumentos
@AllArgsConstructor // Genera un constructor con todos los argumentos
@Builder
public class NuclearPlant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // Nombre de la planta
    private String location; // Ubicación

}
