package com.vehicle.partservice.interfaces.vehiclePart.controller;

import com.vehicle.partservice.interfaces.vehiclePart.model.CreateVehiclePartCommend;
import com.vehicle.partservice.mapper.VehiclePartMapper;
import com.vehicle.partservice.model.entity.VehiclePartEntity;
import com.vehicle.partservice.model.entity.VehiclePartRepository;
import com.vehicle.partservice.response.InternalServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicle-part")
public class VehiclePartController {

    private VehiclePartRepository vehiclePartRepository;

    private VehiclePartMapper vehiclePartMapper;

    @GetMapping("/all")
    public InternalServiceResponse<List<VehiclePartEntity>> findAllVehicles(){
        List<VehiclePartEntity> allVehicles = vehiclePartRepository.findAll();
        return InternalServiceResponse.<List<VehiclePartEntity>>builder()
                .payloadList(Collections.singletonList(allVehicles))
                .httpStatus(HttpStatus.OK)
                .build();
    }
    @GetMapping("/{id}")
    public InternalServiceResponse<VehiclePartEntity> findVehicleById(@PathVariable("id") Long id){
        VehiclePartEntity vehicleEntity = vehiclePartRepository.findById(id).orElseThrow(RuntimeException::new);
        return InternalServiceResponse.<VehiclePartEntity>builder()
                .payload(vehicleEntity)
                .httpStatus(HttpStatus.OK)
                .build();
    }
    @GetMapping("/uri/{uuid}")
    public InternalServiceResponse<VehiclePartEntity> findVehicleByUuid(@PathVariable("uuid") UUID uuid){
        VehiclePartEntity vehicleEntity = vehiclePartRepository.findByUuid(uuid).orElseThrow(RuntimeException::new);
        return InternalServiceResponse.<VehiclePartEntity>builder()
                .payload(vehicleEntity)
                .httpStatus(HttpStatus.OK)
                .build();
    }
    @PostMapping("/save")
    public InternalServiceResponse<VehiclePartEntity> saveVehicle(@RequestBody CreateVehiclePartCommend createVehicleCommand){
        VehiclePartEntity savedVehicleEntity = vehiclePartRepository.save(vehiclePartMapper.createVehiclePartCommendToVehiclePartEntity(createVehicleCommand));
        return InternalServiceResponse.<VehiclePartEntity>builder()
                .payload(savedVehicleEntity)
                .httpStatus(HttpStatus.CREATED)
                .build();
    }

}
