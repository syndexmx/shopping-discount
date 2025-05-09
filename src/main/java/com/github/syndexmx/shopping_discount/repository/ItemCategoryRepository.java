package com.github.syndexmx.shopping_discount.repository;

import com.github.syndexmx.shopping_discount.model.entity.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCategoryRepository extends JpaRepository<ItemCategory, Long> {
}
