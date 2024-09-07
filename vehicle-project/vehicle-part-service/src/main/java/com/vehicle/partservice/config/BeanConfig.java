package com.vehicle.partservice.config;

import com.vehicle.partservice.repository.VehiclePartJPARepository;
import com.vehicle.partservice.repository.VehiclePartJPARepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public VehiclePartJPARepositoryAdapter adapter(VehiclePartJPARepository vehicleJPARepository){
        return new VehiclePartJPARepositoryAdapter(vehicleJPARepository);
    }
}
