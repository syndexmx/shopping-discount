package com.github.syndexmx.shopping_discount.repository;

import com.github.syndexmx.shopping_discount.model.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Long> {
}
