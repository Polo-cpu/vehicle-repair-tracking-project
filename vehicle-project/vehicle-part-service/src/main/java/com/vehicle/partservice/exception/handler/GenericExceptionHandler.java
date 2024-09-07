package com.vehicle.partservice.exception.handler;

import com.vehicle.partservice.exception.VehiclePartNotCreatedException;
import com.vehicle.partservice.exception.VehiclePartNotFoundException;
import com.vehicle.partservice.response.InternalServiceResponse;
import com.vehicle.partservice.response.MessageResponse;
import com.vehicle.partservice.utils.MessageCodes;
import com.vehicle.partservice.utils.MessageUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;
@RestControllerAdvice
public class GenericExceptionHandler {
    @ExceptionHandler(VehiclePartNotCreatedException.class)
    public InternalServiceResponse<String> handleVehicleNotCreatedException(VehiclePartNotCreatedException vehicleNotCreatedException){
        return  InternalServiceResponse.<String>builder()
                .messageResponse(MessageResponse.builder().title(MessageUtils.getMessage(vehicleNotCreatedException.getLanguage(), MessageCodes.ERROR))
                        .description(vehicleNotCreatedException.getMessageCodes().toString()).build())
                .httpStatus(HttpStatus.BAD_REQUEST)
                .hasError(true)
                .errorMessages(Collections.singletonList(vehicleNotCreatedException.getMessage()))
                .build();
    }
    @ExceptionHandler(VehiclePartNotFoundException.class)
    public InternalServiceResponse<String> handleVehicleNotFoundException(VehiclePartNotFoundException vehicleNotFoundException){
        return  InternalServiceResponse.<String>builder()
                .messageResponse(MessageResponse.builder().title(MessageUtils.getMessage(vehicleNotFoundException.getLanguage(),MessageCodes.ERROR))
                        .description(vehicleNotFoundException.getMessageCodes().toString()).build())
                .httpStatus(HttpStatus.BAD_REQUEST)
                .hasError(true)
                .errorMessages(Collections.singletonList(vehicleNotFoundException.getMessage()))
                .build();
    }
}
