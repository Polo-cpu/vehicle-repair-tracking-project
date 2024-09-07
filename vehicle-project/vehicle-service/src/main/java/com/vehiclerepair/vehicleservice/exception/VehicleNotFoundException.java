package com.vehiclerepair.vehicleservice.exception;

import com.vehiclerepair.vehicleservice.model.enums.Language;
import com.vehiclerepair.vehicleservice.utils.IMessageCodes;
import com.vehiclerepair.vehicleservice.utils.MessageUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class VehicleNotFoundException extends RuntimeException{
    private final Language language;
    private final IMessageCodes messageCodes;
    public VehicleNotFoundException(Language language, IMessageCodes messageCodes){
        super(MessageUtils.getMessage(language,messageCodes));
        this.messageCodes = messageCodes;
        this.language = language;
        log.error("[VehicleNotFoundException] -> message: {}, developer message: {}",MessageUtils.getMessage(language,messageCodes),messageCodes);
    }
}
