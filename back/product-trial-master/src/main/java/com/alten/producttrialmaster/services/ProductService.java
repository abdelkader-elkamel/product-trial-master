package com.alten.producttrialmaster.services;

import com.alten.producttrialmaster.dtos.ProductDto;
import java.util.List;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);
    List<ProductDto> getAllProducts();
    ProductDto getProductById(Long id);
    ProductDto updateProduct(Long id, ProductDto productDto);
    ProductDto deleteProduct(Long id);
}
