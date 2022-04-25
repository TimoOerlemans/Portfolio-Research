package com.example.backendproduct.Categorie;


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
    private CategoryRepository repository;

    @GetMapping("/category")
    public List<Category> getAllCategory(){
        return repository.findAll();
    }

    @PostMapping("/category")
    public Category saveProduct(@RequestBody Category category){
        return repository.save(category);
    }

    @DeleteMapping("/category/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteCategory(@PathVariable long id){
        Category category = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category does not exist with id" + id));

        repository.delete(category);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}

