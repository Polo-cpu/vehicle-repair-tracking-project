package com.vehicle.partservice.mapper;


import com.vehicle.partservice.interfaces.vehiclePart.model.CreateVehiclePartCommend;
import com.vehicle.partservice.model.entity.VehiclePartEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehiclePartMapper {

    VehiclePartEntity createVehiclePartCommendToVehiclePartEntity(CreateVehiclePartCommend createVehiclePartCommend);
}
