package com.github.syndexmx.shopping_discount.model.enums;

import lombok.Getter;

@Getter
public enum ClientLevel {
    DEFAULT,
    BASIC,
    ADVANCED,
    VIP;

    public static ClientLevel fromString(String string) {
        return ClientLevel.valueOf(string);
    }
}
