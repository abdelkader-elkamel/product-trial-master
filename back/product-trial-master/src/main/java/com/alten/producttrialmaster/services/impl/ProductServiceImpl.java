package com.alten.producttrialmaster.services.impl;

import com.alten.producttrialmaster.dtos.ProductDto;
import com.alten.producttrialmaster.exceptions.ProductNotFoundException;
import com.alten.producttrialmaster.models.entities.Product;
import com.alten.producttrialmaster.mappers.ProductMapper;
import com.alten.producttrialmaster.repositories.ProductRepository;
import com.alten.producttrialmaster.services.ProductService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Product product = productMapper.dtoToEntity(productDto);
        product.setCreatedAt(LocalDateTime.now());
        product = productRepository.save(product);
        return productMapper.entityToDto(product);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return productMapper.entitiesToDtos(products);
    }

    @Override
    public ProductDto getProductById(Long id) {
            Product product = productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product with ID " + id + " not found"));


        return productMapper.entityToDto(product);
    }

    @Override
    public ProductDto updateProduct(Long id, ProductDto productDto) {
        Product product = productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product with ID " + id + " not found"));

        if(productDto.getCode() != null){
            product.setCode(productDto.getCode());
        }
        if(productDto.getName() != null){
            product.setName(productDto.getName());
        }
        if(productDto.getCategory() != null){
            product.setCategory(productDto.getCategory());
        }
        if(productDto.getDescription() != null){
            product.setDescription(productDto.getDescription());
        }
        if(productDto.getImage() != null){
            product.setImage(productDto.getImage());
        }
        if(productDto.getQuantity() != null){
            product.setQuantity(productDto.getQuantity());
        }
        if(productDto.getShellId() != null){
            product.setShellId(productDto.getShellId());
        }
        if(productDto.getRating() != null){
            product.setRating(productDto.getRating());
        }
        if(productDto.getInternalReference() != null){
            product.setInternalReference(productDto.getInternalReference());
        }
        if(productDto.getInventoryStatus() != null){
            product.setInventoryStatus(productDto.getInventoryStatus());
        }
        if(productDto.getPrice() != null){
            product.setPrice(productDto.getPrice());
        }
        product.setUpdatedAt(LocalDateTime.now());
        product=productRepository.save(product);
        return productMapper.entityToDto(product);
    }

    @Override
    public ProductDto deleteProduct(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product with ID " + id + " not found"));
        productRepository.deleteById(id);
        return productMapper.entityToDto(product);
    }
}
