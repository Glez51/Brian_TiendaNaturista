package com.example.Brian_Tienda.controller;

import com.example.Brian_Tienda.models.productModel;
import com.example.Brian_Tienda.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @PostMapping()
    public productModel saveProduct(@RequestBody productModel product) {
        return productService.saveProduct(product);
    }

    @GetMapping()
    public ArrayList<productModel> findAllProducts() {
        return productService.findAllProducts();
    }
//editar
    @PutMapping
    public productModel updateProduct(@RequestBody productModel product) {
        return productService.saveProduct(product);
    }

    //buscar por codigo
    @GetMapping(path="/find-by-code") //localhost8080/products/find-by-code?
    public ArrayList<productModel> findByCode(@RequestParam("code") Integer code) {
        return productService.findBycode(code);
    }


    //buscar por nombre
    @GetMapping(path="/find-by-name") //localhost8080/products/find-by-name?
    public ArrayList<productModel> findByCode(@RequestParam("name") String name) {
        return productService.findBynName(name);
    }
}
