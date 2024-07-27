package com.vehiclerepair.vehicleservice.utils;

import com.vehiclerepair.vehicleservice.model.enums.Language;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.util.Locale;
import java.util.MissingResourceException;

@Slf4j
@UtilityClass
public class MessageUtils {
    private static final String SPECIAL_CHARACTER="__";
    public static String getMessage(Language language, IMessageCodes messageCodes){
        String messageKey = null;
        try{
            Locale locale = new Locale(language.name());
            return messageKey = messageCodes.getClass().getSimpleName() + SPECIAL_CHARACTER + messageCodes;
        }catch (MissingResourceException missingResourceException){
            log.error("message not found for the key: {} ", messageKey);
            return null;
        }
    }
}
