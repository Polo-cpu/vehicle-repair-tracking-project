package com.vehiclerepair.vehicleservice.config;

import com.vehiclerepair.vehicleservice.mapper.VehicleMapper;
import com.vehiclerepair.vehicleservice.repository.VehicleJPARepository;
import com.vehiclerepair.vehicleservice.repository.VehicleJPARepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public VehicleJPARepositoryAdapter adapter(VehicleJPARepository vehicleJPARepository){
        return new VehicleJPARepositoryAdapter(vehicleJPARepository);
    }
}
