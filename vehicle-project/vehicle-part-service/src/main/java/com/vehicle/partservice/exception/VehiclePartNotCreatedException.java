package com.vehicle.partservice.exception;

import com.vehicle.partservice.model.enums.Language;
import com.vehicle.partservice.utils.IMessageCodes;
import com.vehicle.partservice.utils.MessageUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class VehiclePartNotCreatedException extends RuntimeException{
    private final Language language;
    private final IMessageCodes messageCodes;
    public VehiclePartNotCreatedException(Language language, IMessageCodes messageCodes){
        super(MessageUtils.getMessage(language,messageCodes));
        this.language = language;
        this.messageCodes = messageCodes;
        log.error("[VehicleNotCreatedException] -> message: {}, developer message: {}",MessageUtils.getMessage(language,messageCodes),messageCodes);
    }
}
