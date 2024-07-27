package com.vehiclerepair.vehicleservice.exception.handler;

import com.vehiclerepair.vehicleservice.exception.VehicleNotCreatedException;
import com.vehiclerepair.vehicleservice.exception.VehicleNotFoundException;
import com.vehiclerepair.vehicleservice.response.InternalServiceResponse;
import com.vehiclerepair.vehicleservice.response.MessageResponse;
import com.vehiclerepair.vehicleservice.utils.MessageCodes;
import com.vehiclerepair.vehicleservice.utils.MessageUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;

@RestControllerAdvice
public class GenericExceptionHandler {
    @ExceptionHandler(VehicleNotCreatedException.class)
    public InternalServiceResponse<String> handleVehicleNotCreatedException(VehicleNotCreatedException vehicleNotCreatedException){
        return  InternalServiceResponse.<String>builder()
                .messageResponse(MessageResponse.builder().title(MessageUtils.getMessage(vehicleNotCreatedException.getLanguage(),MessageCodes.ERROR))
                        .description(vehicleNotCreatedException.getMessageCodes().toString()).build())
                .httpStatus(HttpStatus.BAD_REQUEST)
                .hasError(true)
                .errorMessages(Collections.singletonList(vehicleNotCreatedException.getMessage()))
                .build();
    }
    @ExceptionHandler(VehicleNotFoundException.class)
    public InternalServiceResponse<String> handleVehicleNotFoundException(VehicleNotFoundException vehicleNotFoundException){
        return  InternalServiceResponse.<String>builder()
                .messageResponse(MessageResponse.builder().title(MessageUtils.getMessage(vehicleNotFoundException.getLanguage(),MessageCodes.ERROR))
                        .description(vehicleNotFoundException.getMessageCodes().toString()).build())
                .httpStatus(HttpStatus.BAD_REQUEST)
                .hasError(true)
                .errorMessages(Collections.singletonList(vehicleNotFoundException.getMessage()))
                .build();
    }
}
