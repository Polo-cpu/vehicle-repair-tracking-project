package com.vehicle.partservice.model.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "vehicle_part")
public class VehiclePartEntity {
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
    @Column(name ="vehicleType")
    private String vehicleType;
    @Column(name ="amount")
    private String amount;
    @Column(name ="count")
    private Integer count;
    @Column(name ="isPreOwned")
    private Boolean isPreOwned;
    @Column(name ="description")
    private String description;
}
