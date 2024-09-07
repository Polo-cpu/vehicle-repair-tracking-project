package com.vehicle.partservice.exception;

import com.vehicle.partservice.model.enums.Language;
import com.vehicle.partservice.utils.IMessageCodes;
import com.vehicle.partservice.utils.MessageUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class VehiclePartNotFoundException extends RuntimeException{
    private final Language language;
    private final IMessageCodes messageCodes;
    public VehiclePartNotFoundException(Language language, IMessageCodes messageCodes){
        super(MessageUtils.getMessage(language,messageCodes));
        this.messageCodes = messageCodes;
        this.language = language;
        log.error("[VehicleNotFoundException] -> message: {}, developer message: {}",MessageUtils.getMessage(language,messageCodes),messageCodes);
    }
}
