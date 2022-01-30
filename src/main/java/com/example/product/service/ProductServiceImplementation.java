package com.example.product.service;

import com.example.product.pojo.Products;
import com.example.product.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImplementation implements ProductService{

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<Products> findAll() {
        return productsRepository.findAll();
    }

    @Override
    public Products addProduct(Products products) {
        return productsRepository.save(products);
    }

    @Override
    public String delete(Integer id) {
        productsRepository.deleteById(id);
        return "Product has been deleted";
    }
}
