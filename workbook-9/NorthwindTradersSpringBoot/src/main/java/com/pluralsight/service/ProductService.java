package com.pluralsight.service;

import com.pluralsight.dao.IProductDao;
import com.pluralsight.dao.SimpleProductDao;
import com.pluralsight.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    private IProductDao productDao;

    @Autowired
    public ProductService() {
        this.productDao = new SimpleProductDao();
    }

    public void addProduct(Product product){
        productDao.add(product);
    }

    public List<Product> getAllProducts(){
        return productDao.getAll();
    }
}
