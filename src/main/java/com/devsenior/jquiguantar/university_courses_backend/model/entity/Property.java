package com.devsenior.jquiguantar.university_courses_backend.model.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "Propiedades")
@NoArgsConstructor
@AllArgsConstructor
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private String city;
    private double price;
    private Integer bedrooms;
    private Integer bathrooms;
    private String imageUrl;
    private String description;
}
