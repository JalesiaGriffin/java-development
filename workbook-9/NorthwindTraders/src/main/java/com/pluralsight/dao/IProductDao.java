package com.pluralsight.dao;

import com.pluralsight.model.Product;

import java.util.List;

public interface IProductDao {
    void add(Product product);
    List<Product> getAll();
}
