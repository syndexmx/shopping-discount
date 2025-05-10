package com.github.syndexmx.shopping_discount.model.entity;

import com.github.syndexmx.shopping_discount.model.enums.DiscountCollectionType;
import com.github.syndexmx.shopping_discount.model.enums.converter.DiscountCollectionTypeConverter;
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
    @Column(name = "discount_id", updatable = false)
    private Long discountId;

    private String name;

    private LocalDateTime validFrom;
    private LocalDateTime expiresAt;
    
    private Integer discountValue;

    @Convert(converter = DiscountCollectionTypeConverter.class)
    private DiscountCollectionType collectionType;

    @ManyToMany
    @JoinColumn(name = "item_category_id")
    private Set<ItemCategory> itemCategories;

    @ManyToMany
    @JoinColumn(name = "client_id")
    private Set<Client> clients;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
