package com.vehiclerepair.vehicleservice.repository;


import com.vehiclerepair.vehicleservice.model.entity.VehicleEntity;
import com.vehiclerepair.vehicleservice.model.entity.VehicleRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;



@Getter
@Setter
@AllArgsConstructor
public class VehicleJPARepositoryAdapter implements VehicleRepository {
    @Autowired
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
