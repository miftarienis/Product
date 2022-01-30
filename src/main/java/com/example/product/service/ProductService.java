package com.example.product.service;

import com.example.product.pojo.Products;

import java.util.List;

    public interface ProductService {
        List<Products> findAll();
        Products addProduct(Products products);
        String delete(Integer id);
    }

