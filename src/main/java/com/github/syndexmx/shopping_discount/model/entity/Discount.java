package com.github.syndexmx.shopping_discount.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "discounts")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long discountId;

    private String name;

    private LocalDateTime validFrom;
    private LocalDateTime expiresAt;
    
    private Integer discountValue;

    @ManyToMany
    @JoinColumn(name = "itemCategoryId")
    private ItemCategory itemCategory;

    @ManyToMany
    @JoinColumn(name = "clientId")
    private Set<Client> clients;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
