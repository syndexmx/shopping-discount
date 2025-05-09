package com.github.syndexmx.shopping_discount.model.enums;

import lombok.Getter;

@Getter
public enum DiscountCollectionType {
    EXCLUSIVE,
    CUMULATIVE;

    public static ClientLevel fromString(String string) {
        return ClientLevel.valueOf(string);
    }
}
