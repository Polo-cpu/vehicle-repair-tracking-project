package com.vehicle.partservice.repository;

import com.vehicle.partservice.model.entity.VehiclePartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface VehiclePartJPARepository extends JpaRepository<VehiclePartEntity, Long> {
    @Query("select v from VehiclePartEntity v where v.uuid = :uuid")
    Optional<VehiclePartEntity> findByUuid(UUID uuid);
}
