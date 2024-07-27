package com.vehiclerepair.vehicleservice.interfaces.vehicle.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateVehicleCommand {
    private String brand;

    private String model;

    private String fuelType;

    private String vehicleType;

    private String damageRecord;

    private String licencePlate;

    private List<String> vehiclePhotos;
}
