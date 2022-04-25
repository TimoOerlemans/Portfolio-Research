package com.example.backendproduct.Categorie;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "categorie")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    @Column(name = "name")
    public String name;
}
