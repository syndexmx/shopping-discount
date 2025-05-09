package com.github.syndexmx.shopping_discount.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoyaltyDiscountRequest {

    @NotNull(message = "clientId should not be null")
    private Long clientId;
    @NotNull(message = "itemCategoryId should not be null")
    private Long itemCategoryId;

}
