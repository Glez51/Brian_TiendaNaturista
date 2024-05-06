package com.example.Brian_Tienda.services;

import com.example.Brian_Tienda.models.productModel;
import com.example.Brian_Tienda.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService {
    @Autowired
    ProductsRepository productRepository;

    //Obtener productos registrados
    public ArrayList<productModel> findAllProducts(){
        return (ArrayList<productModel>) productRepository.findAll();
    }

    //Guardar producto
    public productModel saveProduct(productModel product){
        return productRepository.save(product);
    }
//buscar por nombre
    public ArrayList<productModel> findBynName(String name){
        return productRepository.findByName(name);
    }
        //buscar por codigo
        public ArrayList<productModel> findBycode(Integer code){
        return productRepository.findByCode(code);
        }
    }
