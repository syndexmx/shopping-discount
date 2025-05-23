package com.github.syndexmx.shopping_discount.model.entity;

import com.github.syndexmx.shopping_discount.model.enums.ClientLevel;
import com.github.syndexmx.shopping_discount.model.enums.Region;
import com.github.syndexmx.shopping_discount.model.enums.converter.ClientLevelConverter;
import com.github.syndexmx.shopping_discount.model.enums.converter.RegionConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id", updatable = false)
    private Long clientId;

    private String firstName;
    private String patronymic;
    private String lastName;
    private LocalDate birthDate;
    private Long phoneNumber;

    @Convert(converter = RegionConverter.class)
    private Region region;
    private String city;
    private String street;
    private String building;
    private Integer apartment;

    private BigDecimal bonus;

    @Convert(converter = ClientLevelConverter.class)
    private ClientLevel clientLevel;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
