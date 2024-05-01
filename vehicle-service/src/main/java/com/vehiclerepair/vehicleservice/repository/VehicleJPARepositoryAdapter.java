package com.vehiclerepair.vehicleservice.repository;

import com.vehiclerepair.vehicleservice.interfaces.vehicle.model.CreateVehicleCommand;
import com.vehiclerepair.vehicleservice.model.entity.VehicleEntity;
import com.vehiclerepair.vehicleservice.model.entity.VehicleRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@AllArgsConstructor
public class VehicleJPARepositoryAdapter implements VehicleRepository{
    private VehicleJPARepository vehicleJPARepository;
    @Override
    public List<VehicleEntity> findAll() {
        return vehicleJPARepository.findAll();
    }

    @Override
    public Optional<VehicleEntity> findById(Long id) {
        return vehicleJPARepository.findById(id);
    }

    @Override
    public Optional<VehicleEntity> findByUuid(UUID uuid) {
        return vehicleJPARepository.findByUuid(uuid);
    }

    @Override
    public VehicleEntity save(VehicleEntity vehicleEntity) {
        return vehicleJPARepository.save(vehicleEntity);
    }
}
