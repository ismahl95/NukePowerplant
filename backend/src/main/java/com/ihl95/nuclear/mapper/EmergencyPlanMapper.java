package com.ihl95.nuclear.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.ihl95.nuclear.dto.EmergencyPlanDTO;
import com.ihl95.nuclear.model.EmergencyPlan;

@Mapper(componentModel = "spring")
public interface EmergencyPlanMapper {
    EmergencyPlanMapper INSTANCE = Mappers.getMapper(EmergencyPlanMapper.class);

    @Mapping(source = "nuclearPlant", target = "nuclearPlant")
    EmergencyPlanDTO toEmergencyPlanDTO(EmergencyPlan emergencyPlan);

    @Mapping(source = "nuclearPlant", target = "nuclearPlant")
    EmergencyPlan toEmergencyPlan(EmergencyPlanDTO emergencyPlanDTO);
}

