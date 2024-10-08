package com.vehicle.partservice.response;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.List;
@Data
@Builder
public class InternalServiceResponse<T> {

    private T payload;
    private List<T> payloadList;
    private boolean hasError;
    private List<String> errorMessages;
    private HttpStatus httpStatus;
}
