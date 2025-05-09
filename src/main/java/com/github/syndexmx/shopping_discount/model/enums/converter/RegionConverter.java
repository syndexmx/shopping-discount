package com.github.syndexmx.shopping_discount.model.enums.converter;

import com.github.syndexmx.shopping_discount.model.enums.Region;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RegionConverter implements AttributeConverter<Region, String> {


    @Override
    public String convertToDatabaseColumn(Region attribute) {
        return attribute == null ? null : attribute.name();
    }

    @Override
    public Region convertToEntityAttribute(String dbData) {
        return dbData == null ? null : Region.valueOf(dbData);
    }
}
