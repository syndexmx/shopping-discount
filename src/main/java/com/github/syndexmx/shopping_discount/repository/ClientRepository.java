package com.github.syndexmx.shopping_discount.repository;

import com.github.syndexmx.shopping_discount.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
