package com.isaacsuntag.productsandcategories.repositories;

import org.springframework.data.repository.CrudRepository;

import com.isaacsuntag.productsandcategories.models.Category;

public interface CategoryRepo extends CrudRepository<Category, Long> {

}
