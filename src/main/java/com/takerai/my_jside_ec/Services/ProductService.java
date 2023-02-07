package com.takerai.my_jside_ec.Services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import com.takerai.my_jside_ec.Entities.Product;

public interface ProductService {

    Product addProduct(Product product);

    Product editProduct(Product product);

    void deleteProduct(Long id);

    Page<Product> getRequestFilters(
        int page,
        int limit, 
        String productName,
        Sort.Direction sortType
        );
}
