package com.example.backendproduct.Producttest;

import com.example.backendproduct.Product.Product;
import com.example.backendproduct.Product.ProductRepository;
import com.example.backendproduct.Product.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
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

        ArgumentCaptor<Product> dishArgumentCaptor =
                ArgumentCaptor.forClass(Product.class);
        verify(repository)
                .save(dishArgumentCaptor.capture());

        Product actual = dishArgumentCaptor.getValue();


        assertThat(expected).isEqualTo(actual);
    }

    @Test
    void DeleteRoom(){
        Long id = 1L;

        given(repository.existsById(id)).willReturn(true);

        service.deleteProduct(id);
        verify(repository).deleteById(id);
    }

    @Test
    void GetProducts(){
        service.getAllProducts();
        verify(repository).findAll();
    }
}
