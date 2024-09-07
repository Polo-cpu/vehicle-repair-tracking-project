package com.vehicle.partservice.interfaces.vehiclePart.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateVehiclePartCommend {

    private String brand;

    private String model;

    private String vehicleType;

    private String amount;

    private Integer count;

    private Boolean isPreOwned;

    private String description;
}
