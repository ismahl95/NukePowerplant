package com.ihl95.nuclear.nuclearPlant.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihl95.nuclear.nuclearPlant.infraestructure.NuclearPlantRepository;

@Service
public class CountNuclearPlants {
  
  @Autowired
  private NuclearPlantRepository nuclearPlantRepository;

  public long countNuclearPlants() {
    return nuclearPlantRepository.count();
  }

}
