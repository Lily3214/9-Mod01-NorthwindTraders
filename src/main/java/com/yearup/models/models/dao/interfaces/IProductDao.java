package com.yearup.models.dao.interfaces;

import com.yearup.models.models.Product;

import java.util.List;

public interface IProductDao {
    void add(Product product);

    List<Product> getAll();

    Product getProductById(int productId);

    void update(Product product);

    void delete(Product product);
}
