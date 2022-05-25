package com.example.backendproduct.Categorie;


import com.example.backendproduct.Product.Product;
import com.example.backendproduct.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/")
@RestController
public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping("/category")
    public List<Category> getAllCategories(){
        return service.GetAllCategories();
    }

    @PostMapping("/add")
    public Category saveCategory(@RequestBody Category category){
        return service.saveCategory(category);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable long id){
        service.deleteCategory(id);
    }

    @PutMapping("/update")
    public Category updateCategory(@RequestBody Category category) {
        return service.updateCategory(category);
    }
}

