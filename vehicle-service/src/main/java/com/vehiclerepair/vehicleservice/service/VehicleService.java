package com.vehiclerepair.vehicleservice.service;

import com.vehiclerepair.vehicleservice.model.entity.VehicleEntity;
import com.vehiclerepair.vehicleservice.model.entity.VehicleRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class VehicleService {
    private VehicleRepository repository;

    public List<VehicleEntity> allVehicles(){
        return repository.findAll();
    }
}
