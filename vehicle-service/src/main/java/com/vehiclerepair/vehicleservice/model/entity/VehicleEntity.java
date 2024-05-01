package com.vehiclerepair.vehicleservice.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Entity
@Data
@Getter
@Setter
@RequiredArgsConstructor
@Document(collection = "vehicle")
public class VehicleEntity {
    @Column(name= "id")
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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
