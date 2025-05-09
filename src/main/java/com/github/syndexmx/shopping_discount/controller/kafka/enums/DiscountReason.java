package com.github.syndexmx.shopping_discount.controller.kafka.enums;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public enum DiscountReason {
    LOYALTY,
    PROMO,
    UNDEFINED;

    public static DiscountReason fromString(String string) {
        try {
            return DiscountReason.valueOf(string);
        } catch (IllegalArgumentException e) {
            log.error(e.getMessage());
            return UNDEFINED;
        }
    }
}
