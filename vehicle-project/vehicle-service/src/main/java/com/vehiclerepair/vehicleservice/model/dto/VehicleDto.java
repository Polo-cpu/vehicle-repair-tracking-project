package com.vehiclerepair.vehicleservice.model.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.List;
@Data
@Getter
@AllArgsConstructor
public class VehicleDto {
    private String brand;

    private String model;

    private String fuelType;

    private String vehicleType;

    private String damageRecord;

    private String licencePlate;

    private List<String> vehiclePhotos;
}
