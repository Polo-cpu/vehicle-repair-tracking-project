package com.vehiclerepair.vehicleservice.model.entity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
public interface VehicleRepository{

    List<VehicleEntity> findAll();

    Optional<VehicleEntity> findById(Long id);

    Optional<VehicleEntity> findByUuid(UUID uuid);

    VehicleEntity save(VehicleEntity vehicleEntity);
}
