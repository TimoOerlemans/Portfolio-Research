package com.example.backendproduct;

import com.example.backendproduct.Product.Product;
import com.example.backendproduct.Product.ProductRepository;
import com.example.backendproduct.Product.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class ProductServiceTest {
    @Mock
    private ProductRepository repository;
    private ProductService service;

    @BeforeEach
    void setUp() {
        service = new ProductService(repository);
    }

    @Test
    void CreateProduct() {
        Product expected = new Product(1L, "Tonno", "Tonno, Tomato sauce", 12.00);

        service.saveProduct(expected);

        Product Actual = new Product(1L, "Tonno", "Tonno, Tomato sauce", 12.00);

        assert(expected.id).equals(Actual.id);
        assert(expected.name).equals(Actual.name);
        assert(expected.ingredients).equals(Actual.ingredients);
        assert(expected.price).equals(Actual.price);
    }
}
