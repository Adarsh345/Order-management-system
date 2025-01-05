package com.order.product.service;

import com.order.product.model.Product;

import java.util.List;

public interface ProductService {

    Product  createProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(String id);

    Product updateProduct(String id, Product product);

    void deleteProduct(String id);
}
