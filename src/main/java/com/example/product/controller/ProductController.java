package com.example.product.controller;

import com.example.product.pojo.Products;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Products> getAllProducts() {
        return productService.findAll();
    }

    @PostMapping("/product")
    public Products addProduct(@RequestParam Integer id,@RequestParam String model, @RequestParam String description){
        Products products = new Products();
        products.setId(id);
        products.setTitle(model);
        products.setDescription(description);

        return productService.addProduct(products);
    }

    @DeleteMapping("/product/{id}")
    public String deleteProductById(@PathVariable Integer id){
        return productService.delete(id);
    }


}

