package com.github.syndexmx.shopping_discount.model.entity;

import com.github.syndexmx.shopping_discount.model.enums.ClientLevel;
import com.github.syndexmx.shopping_discount.model.enums.converter.ClientLevelConverter;
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
    private Long clientId;

    private String firstName;
    private String patronymic;
    private String lastName;
    private LocalDate birthDate;
    private Long phoneNumber;
    private String region;
    private String city;
    private String street;
    private String building;
    private Integer apartment;

    private BigDecimal bonus;

    @Convert(converter = ClientLevelConverter.class)
    private ClientLevel clientLevel;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
