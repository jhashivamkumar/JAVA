package com.isaacsuntag.productsandcategories.repositories;

import org.springframework.data.repository.CrudRepository;

import com.isaacsuntag.productsandcategories.models.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

}
