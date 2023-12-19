package com.pluralsight.dao;

import com.pluralsight.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDao implements IProductDao{
    private List<Product> products;

    public SimpleProductDao() {
        this.products = new ArrayList<>();
        this.products.add(new Product(1, "Product1", "Category1", 29.99));
        this.products.add(new Product(2, "Product2", "Category2", 39.99));
        this.products.add(new Product(3, "Product3", "Category3", 49.99));
        this.products.add(new Product(4, "Product4", "Category4", 59.99));
        this.products.add(new Product(5, "Product5", "Category5", 69.99));
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
