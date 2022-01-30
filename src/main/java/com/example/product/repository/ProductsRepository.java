package com.example.product.repository;

import com.example.product.pojo.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends CrudRepository <Products, Integer>{

    List<Products> findAll();
    Products findProductsById(Integer id);

    void deleteById(Integer id);

}

