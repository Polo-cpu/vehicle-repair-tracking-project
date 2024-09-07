package com.vehiclerepair.vehicleservice.mapper;

import com.vehiclerepair.vehicleservice.interfaces.vehicle.model.CreateVehicleCommand;
import com.vehiclerepair.vehicleservice.model.entity.VehicleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehicleMapper {
    VehicleEntity createVehicleCommandtoVehicleEntity(CreateVehicleCommand createVehicleCommand);
}
