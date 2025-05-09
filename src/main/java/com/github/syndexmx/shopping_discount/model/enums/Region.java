package com.github.syndexmx.shopping_discount.model.enums;

import lombok.Getter;

@Getter
public enum Region {
    MOSCOW("Москва"),
    MOSCOW_REGION("Московская область"),
    SPB("Санкт-Петербург"),
    LENINGRAD_REGION("Ленинградская область"),
    KALININRAD_REGION("Калининградская область"),
    TULA_REGION("Тульская область"),
    KALUGA_REGION("Калужская область"),
    RYAZAN_REGION("Рязанская область"),
    SMOLENSK_REGION("Смоленская область"),
    YAROSLAVL_REGION("Ярославская область"),
    VLADIMIR_REGION("Владимирская область"),
    TATARSTAN("Республика Татарстан"),
    TVER_REGION("Тверская область"),
    BRYANSK_REGION("Брянская область"),
    ORYOL_REGION("Орловская область"),
    PSKOV_REGION("Псковская область"),
    VORONEZH_REGION("Воронежская область"),
    KURSK_REGION("Курская область"),
    BELGOROD_REGION("Белгородская область");

    public String regionName;

    private Region(String name) {
        this.regionName = name;
    }

    public static Region fromString(String string) {
        return Region.valueOf(string);
    }

}
