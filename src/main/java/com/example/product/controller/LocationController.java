package com.example.product.controller;

import com.example.product.pojo.Location;
import com.example.product.pojo.Products;
import com.example.product.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/location")
    public List<Location> getAllProducts() {
        return locationService.findAll();
    }
}
