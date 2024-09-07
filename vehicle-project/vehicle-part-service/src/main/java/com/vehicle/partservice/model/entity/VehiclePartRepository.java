package com.vehicle.partservice.model.entity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface VehiclePartRepository {
    List<VehiclePartEntity> findAll();

    Optional<VehiclePartEntity> findById(Long id);

    Optional<VehiclePartEntity> findByUuid(UUID uuid);

    VehiclePartEntity save(VehiclePartEntity vehicleEntity);
}
