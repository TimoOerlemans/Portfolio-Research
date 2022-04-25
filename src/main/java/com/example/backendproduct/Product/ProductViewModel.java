package com.example.backendproduct.Product;

import com.example.backendproduct.Product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductViewModel {

    private long Id;

    private String name;

    private String ingredients;

    private Double price;

    public ProductViewModel(Product product) {
        setId(product.getId());
        setName(product.getName());
        setIngredients(product.getIngredients());
        setPrice(getPrice());
    }

}

