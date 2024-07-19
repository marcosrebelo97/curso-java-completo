package com.webservices.secao12.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.HashSet;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "tb_product")
@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;


    private Set<Category> categories = new HashSet<>();

}
