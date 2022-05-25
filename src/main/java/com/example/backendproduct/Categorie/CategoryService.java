package com.example.backendproduct.Categorie;

import com.example.backendproduct.Product.Product;
import com.example.backendproduct.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@Transactional
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public CategoryService(CategoryRepository categoryRepository){
        this.repository = categoryRepository;
    }

    public List<Category>GetAllCategories(){
        return repository.findAll();
    }

    public Category saveCategory(Category category) {
        return repository.save(category);
    }

    public void deleteCategory(@PathVariable long id){
        boolean exists = repository.existsById(id);
        if (!exists) {
            throw new ResourceNotFoundException("Category with id " + id + " does not exist");
        }
        repository.deleteById(id);
        System.out.println("Category " + id + " deleted!");
    }
    public Category updateCategory(Category category) {
        Category existingProduct =repository.findById(category.getId()).orElse(null);
        existingProduct.setName(category.getName());


        return repository.save(existingProduct);
    }
}
