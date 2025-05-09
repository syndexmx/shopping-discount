package com.github.syndexmx.shopping_discount.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class PromoDiscountRequest {

    @NotNull
    private Long client_id;
    @NotNull
    private Long itemCategoryId;
    @NotNull
    private String promoCode;
}
