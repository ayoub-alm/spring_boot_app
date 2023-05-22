package com.warehouse.warehousemanger;

import com.warehouse.warehousemanger.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface ProductRepository extends JpaRepository<Product, Long> {
}
