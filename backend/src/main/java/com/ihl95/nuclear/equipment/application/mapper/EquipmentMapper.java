package com.ihl95.nuclear.equipment.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.ihl95.nuclear.equipment.application.dto.EquipmentDTO;
import com.ihl95.nuclear.equipment.domain.Equipment;
import com.ihl95.nuclear.maintenance.application.mapper.MaintenanceMapper;

@Mapper(componentModel = "spring", uses = MaintenanceMapper.class) // Asegúrate de incluir el uso de MaintenanceMapper
public interface EquipmentMapper {
    EquipmentMapper INSTANCE = Mappers.getMapper(EquipmentMapper.class);

    @Mapping(source = "maintenances", target = "maintenances")
    EquipmentDTO toEquipmentDTO(Equipment equipment);

    @Mapping(source = "maintenances", target = "maintenances")
    Equipment toEquipment(EquipmentDTO equipmentDTO);
}
