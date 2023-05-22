package com.warehouse.warehousemanger.web;

import com.warehouse.warehousemanger.ProductRepository;
import com.warehouse.warehousemanger.entities.Product;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Data
@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;


    @GetMapping("/all")
    public List<Product> getName(){
        return productRepository.findAll();
    }
}
