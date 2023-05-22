package com.warehouse.warehousemanger.entities;


import com.warehouse.warehousemanger.enums.ProductCategories;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@Builder
@Table(name = "products")
public class Product   {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String sku;
    private int quantite;
    private String name;
    private ProductCategories categorie;

}
