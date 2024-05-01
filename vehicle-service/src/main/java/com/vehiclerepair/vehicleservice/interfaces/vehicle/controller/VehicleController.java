package com.vehiclerepair.vehicleservice.interfaces.vehicle.controller;

import com.vehiclerepair.vehicleservice.interfaces.vehicle.model.CreateVehicleCommand;
import com.vehiclerepair.vehicleservice.mapper.VehicleMapper;
import com.vehiclerepair.vehicleservice.model.entity.VehicleEntity;
import com.vehiclerepair.vehicleservice.model.entity.VehicleRepository;
import com.vehiclerepair.vehicleservice.response.InternalServiceResponse;
import com.vehiclerepair.vehicleservice.service.VehicleService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("vehicle")
public class VehicleController {
    private VehicleRepository vehicleRepository;
    private VehicleMapper vehicleMapper;

    public InternalServiceResponse<List<VehicleEntity>> findAll(){
        List<VehicleEntity> allVehicles = vehicleRepository.findAll();
        return InternalServiceResponse.<List<VehicleEntity>>builder()
                .payloadList(Collections.singletonList(allVehicles))
                .httpStatus(HttpStatus.OK)
                .build();
    }

    public InternalServiceResponse<VehicleEntity> findById(Long id){
        VehicleEntity vehicleEntity = vehicleRepository.findById(id).orElseThrow(() -> new RuntimeException());
        return InternalServiceResponse.<VehicleEntity>builder()
                .payload(vehicleEntity)
                .httpStatus(HttpStatus.OK)
                .build();
    }
    public InternalServiceResponse<VehicleEntity> findByUuid(UUID uuid){
        VehicleEntity vehicleEntity = vehicleRepository.findByUuid(uuid).orElseThrow(() -> new RuntimeException());
        return InternalServiceResponse.<VehicleEntity>builder()
                .payload(vehicleEntity)
                .httpStatus(HttpStatus.OK)
                .build();
    }
    public InternalServiceResponse<VehicleEntity> save(CreateVehicleCommand createVehicleCommand){
        VehicleEntity savedVehicleEntity = vehicleRepository.save(vehicleMapper.toVehicleEntity(createVehicleCommand));
        return InternalServiceResponse.<VehicleEntity>builder()
                .payload(savedVehicleEntity)
                .httpStatus(HttpStatus.CREATED)
                .build();
    }



}
