package com.warehouse.warehousemanger;

import com.warehouse.warehousemanger.entities.Product;
import com.warehouse.warehousemanger.enums.ProductCategories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class WarehouseMangerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarehouseMangerApplication.class, args);
        System.out.println("hello my first Spring boot app");
    }


    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            Product product =  Product.builder()
                    .name("casquet")
                    .categorie(ProductCategories.CLOUTS)
                    .quantite(10)
                    .sku(String.valueOf(UUID.randomUUID()))
                    .build();
            productRepository.save(product);
            System.out.println("command line runner");
        };
    }

}
