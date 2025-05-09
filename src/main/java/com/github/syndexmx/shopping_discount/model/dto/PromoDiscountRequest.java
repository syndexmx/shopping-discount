package com.github.syndexmx.shopping_discount.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PromoDiscountRequest {

    @NotNull(message = "clientId should not be null")
    private Long client_id;
    @NotNull(message = "itemCategoryId should not be null")
    private Long itemCategoryId;
    @NotNull(message = "promoCode is absent")
    private String promoCode;
}
