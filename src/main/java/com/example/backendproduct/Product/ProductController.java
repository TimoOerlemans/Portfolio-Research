package com.example.backendproduct.Product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping()
    public String getMessage(){
        return "Welkom";
    }


}
