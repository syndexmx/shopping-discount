package com.github.syndexmx.shopping_discount.model.enums.converter;

import com.github.syndexmx.shopping_discount.model.enums.DiscountCollectionType;
import com.github.syndexmx.shopping_discount.model.enums.Region;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class DiscountCollectionTypeConverter implements AttributeConverter<DiscountCollectionType, String> {
    @Override
    public String convertToDatabaseColumn(DiscountCollectionType attribute) {
        return attribute == null ? null : attribute.name();
    }

    @Override
    public DiscountCollectionType convertToEntityAttribute(String dbData) {
        return dbData == null ? null : Region.valueOf(dbData);
    }
}
