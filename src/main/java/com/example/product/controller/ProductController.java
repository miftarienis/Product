package com.example.product.controller;

import com.example.product.pojo.Products;
import com.example.product.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductsRepository productsRepository;

    @GetMapping("/products")
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    @PostMapping("/products")
    public Products addProducts(){
        Products products = new Products();
        products.setTitle("Dji Mavic 5");
        products.setId(3);
        products.setDescription("Better then the other ones");


        return productsRepository.save(products);
    }

}
