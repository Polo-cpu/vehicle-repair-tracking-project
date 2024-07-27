package com.vehiclerepair.vehicleservice.model.entity;

import jakarta.persistence.*;
import lombok.*;


import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vehicle")
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name= "id")
    private Long id;
    @Column(name = "unique_vehicle_identity")
    private String uuid;
    @Column(name ="brand")
    private String brand;
    @Column(name ="model")
    private String model;
    @Column(name ="fuel_type")
    private String fuelType;
    @Column(name ="vehicle_type")
    private String vehicleType;
    @Column(name ="damage_record")
    private String damageRecord;
    @Column(name ="licence_plate")
    private String licencePlate;
    @Column(name ="vehicle_photos")
    private List<String> vehiclePhotos;


}
