package com.github.syndexmx.shopping_discount.repository;

import com.github.syndexmx.shopping_discount.model.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
