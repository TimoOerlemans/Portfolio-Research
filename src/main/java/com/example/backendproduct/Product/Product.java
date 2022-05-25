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
    public Long id;
    public String name;
    public String ingredients;
    public Double price;
}
