package com.example.backendproduct.Product;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    @Column(name = "name")
    public String name;

    @Column(name = "ingredients")
    public String ingredients;

    @Column(name = "price")
    public Double price;
    }
