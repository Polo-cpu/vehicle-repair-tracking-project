package com.vehicle.partservice.repository;

import com.vehicle.partservice.model.entity.VehiclePartEntity;
import com.vehicle.partservice.model.entity.VehicleRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@AllArgsConstructor
public class VehiclePartJPARepositoryAdapter implements VehicleRepository {
    private VehiclePartJPARepository vehiclePartJPARepository;
    @Override
    public List<VehiclePartEntity> findAll() {
        return vehiclePartJPARepository.findAll();
    }

    @Override
    public Optional<VehiclePartEntity> findById(Long id) {
        return vehiclePartJPARepository.findById(id);
    }

    @Override
    public Optional<VehiclePartEntity> findByUuid(UUID uuid) {
        return vehiclePartJPARepository.findByUuid(uuid);
    }

    @Override
    public VehiclePartEntity save(VehiclePartEntity vehicleEntity) {
        return vehiclePartJPARepository.save(vehicleEntity);
    }
}
