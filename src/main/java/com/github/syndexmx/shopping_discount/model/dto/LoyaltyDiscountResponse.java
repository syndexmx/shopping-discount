package com.github.syndexmx.shopping_discount.model.dto;

import com.github.syndexmx.shopping_discount.model.dto.enums.RequestResultStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoyaltyDiscountResponse {

    private Long discountId;
    private RequestResultStatus status;
    private String message;
    private LocalDateTime executedAt;

}
