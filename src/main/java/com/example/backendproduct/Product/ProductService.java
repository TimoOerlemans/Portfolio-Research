package com.example.backendproduct.Product;

import com.example.backendproduct.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductService(ProductRepository repository) {
        this.productRepository = repository;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProduct(@PathVariable long id){
        boolean exists = productRepository.existsById(id);
        if (!exists) {
            throw new ResourceNotFoundException("Product with id " + id + " does not exist");
        }
        productRepository.deleteById(id);
        System.out.println("Product " + id + " deleted!");
    }
}

