package com.vehiclerepair.vehicleservice.repository;

import com.vehiclerepair.vehicleservice.model.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Optional;
import java.util.UUID;

public interface VehicleJPARepository extends JpaRepository<VehicleEntity, Long> {

    @Query("select v from VehicleEntity v where v.uuid = :uuid")
    Optional<VehicleEntity> findByUuid(UUID uuid);
}
