package com.vehiclerepair.vehicleservice.response;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;
@Data
@Builder
public class InternalServiceResponse<T> {
    private MessageResponse messageResponse;
    private T payload;
    private List<T> payloadList;
    private boolean hasError;
    private List<String> errorMessages;
    private HttpStatus httpStatus;
}
