package com.example.Brian_Tienda.repository;

import com.example.Brian_Tienda.models.productModel;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository

public interface ProductsRepository extends CrudRepository<productModel,Long>{



    //buscar por codigo
    public abstract ArrayList<productModel> findByCode (Integer code);

    //buscar por nombre
    public abstract ArrayList<productModel> findByName (String name);
    //eliminar por codigo

}
