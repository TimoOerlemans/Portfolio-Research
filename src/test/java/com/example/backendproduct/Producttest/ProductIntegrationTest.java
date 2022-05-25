package com.example.backendproduct.Producttest;
import com.example.backendproduct.Product.ProductController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.backendproduct.Product.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc
@WebMvcTest(ProductController.class)
public class ProductIntegrationTest {
    /*
    @MockBean(classes = {ProductService.class})
    ProductService service;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldCreateProduct() throws Exception {
        Product product = new Product(1L, "Tonno", "Tomato sauce",12.00);

        mockMvc.perform(post("/api/v1/add")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(convertObjectToJsonString(product)))
                .andDo(print()).andExpect(status().isOk());
    }

    private String convertObjectToJsonString(Product product) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(product);
        }
        catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }*/
}
