package com.github.syndexmx.shopping_discount.model.enums.converter;

import com.github.syndexmx.shopping_discount.model.enums.ClientLevel;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ClientLevelConverter implements AttributeConverter<ClientLevel, String> {

    @Override
    public String convertToDatabaseColumn(ClientLevel attribute) {
        return attribute == null ? null : attribute.name();
    }

    @Override
    public ClientLevel convertToEntityAttribute(String dbData) {
        return dbData == null ? null : ClientLevel.fromString(dbData);
    }
}
