package com.vehiclerepair.vehicleservice.interfaces.vehicle.controller;

import com.vehiclerepair.vehicleservice.interfaces.vehicle.model.CreateVehicleCommand;
import com.vehiclerepair.vehicleservice.mapper.VehicleMapper;
import com.vehiclerepair.vehicleservice.model.entity.VehicleEntity;
import com.vehiclerepair.vehicleservice.model.entity.VehicleRepository;
import com.vehiclerepair.vehicleservice.response.InternalServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private final VehicleRepository vehicleRepository;
    @Autowired
    private VehicleMapper vehicleMapper;



    @GetMapping("/all")
    public InternalServiceResponse<List<VehicleEntity>> findAllVehicles(){
        List<VehicleEntity> allVehicles = vehicleRepository.findAll();
        return InternalServiceResponse.<List<VehicleEntity>>builder()
                .payloadList(Collections.singletonList(allVehicles))
                .httpStatus(HttpStatus.OK)
                .build();
    }
    @GetMapping("/{id}")
    public InternalServiceResponse<VehicleEntity> findVehicleById(@PathVariable("id") Long id){
        VehicleEntity vehicleEntity = vehicleRepository.findById(id).orElseThrow(RuntimeException::new);
        return InternalServiceResponse.<VehicleEntity>builder()
                .payload(vehicleEntity)
                .httpStatus(HttpStatus.OK)
                .build();
    }
    @GetMapping("/uri/{uuid}")
    public InternalServiceResponse<VehicleEntity> findVehicleByUuid(@PathVariable("uuid") UUID uuid){
        VehicleEntity vehicleEntity = vehicleRepository.findByUuid(uuid).orElseThrow(RuntimeException::new);
        return InternalServiceResponse.<VehicleEntity>builder()
                .payload(vehicleEntity)
                .httpStatus(HttpStatus.OK)
                .build();
    }
    @PostMapping("/save")
    public InternalServiceResponse<VehicleEntity> saveVehicle(@RequestBody CreateVehicleCommand createVehicleCommand){
        VehicleEntity savedVehicleEntity = vehicleRepository.save(vehicleMapper.createVehicleCommandtoVehicleEntity(createVehicleCommand));
        return InternalServiceResponse.<VehicleEntity>builder()
                .payload(savedVehicleEntity)
                .httpStatus(HttpStatus.CREATED)
                .build();
    }



}
