package com.vehiclerepair.vehicleservice.utils;

import lombok.Getter;

@Getter
public enum MessageCodes implements IMessageCodes {
    OK(1990),
    ERROR(1991),
    VEHICLE_NOT_CREATED(2000),
    VEHICLE_NOT_FOUND(2001);

    private final int value;
    MessageCodes(int value) {
        this.value = value;
    }

    @Override
    public int getMessage() {
        return value;
    }
}
