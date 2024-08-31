package com.ihl95.nuclear.nuclearPlant.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.ihl95.nuclear.nuclearPlant.application.dto.NuclearPlantCompleteDTO;
import com.ihl95.nuclear.nuclearPlant.application.dto.NuclearPlantDTO;
import com.ihl95.nuclear.nuclearPlant.domain.NuclearPlant;

@Mapper(componentModel = "spring")
public interface NuclearPlantCompleteMapper {

    NuclearPlant toNuclearPlant(NuclearPlantDTO nuclearPlantDTO);

    NuclearPlantCompleteDTO toNuclearPlantCompleteDTO(NuclearPlant nuclearPlant);

    NuclearPlantDTO toNuclearPlantDTO(NuclearPlant nuclearPlant);

}
