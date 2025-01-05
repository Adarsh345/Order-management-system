package com.order.product.serviceImpl;

import com.order.product.model.Product;
import com.order.product.repository.ProductRepository;
import com.order.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(String id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

    @Override
    public Product updateProduct(String id, Product product) {
        Product existingProduct = getProductById(id); // Reuse the existing method to fetch the product
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setDescription(product.getDescription());
        return productRepository.save(existingProduct);
    }

    @Override
    public void deleteProduct(String id) {
        Product existingProduct = getProductById(id); // Reuse the existing method to ensure the product exists
        productRepository.delete(existingProduct);
    }
}
