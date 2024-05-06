package com.example.Brian_Tienda.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Products")
public class productModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true)

    private Long id;

    private Integer code;

    private String name;

    private Double price;

    private String brand;

    private Double stock;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }
}


