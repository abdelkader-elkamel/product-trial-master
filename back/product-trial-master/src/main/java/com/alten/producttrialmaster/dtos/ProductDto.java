package com.alten.producttrialmaster.dtos;

import com.alten.producttrialmaster.models.enums.InventoryStatus;
import jakarta.validation.constraints.*;


public class ProductDto {
    private Long id;
    @NotEmpty(message = "Product code should not be empty")
    @NotNull(message = "Product code should not be null")
    private String code;
    @NotEmpty(message = "Product name should not be empty")
    @NotNull(message = "Product name should not be null")
    private String name;
    private String description;
    private String image;
    @NotEmpty(message = "Product category should not be empty")
    @NotNull(message = "Product category should not be null")
    private String category;
    @NotNull(message = "Product price should not be null")
    @DecimalMin(value = "0.01", inclusive = true, message = "Product price must be greater than zero")
    private Double price;
    @NotNull(message = "Product quantity should not be null")
    @Min(value = 0, message = "Product quantity must be equal or greater than zero")
    private Integer quantity;
    @NotEmpty(message = "Internal reference should not be empty")
    @NotNull(message = "Internal reference should not be null")
    private String internalReference;
    @NotNull(message = "Shell id should not be null")
    private Integer shellId;
    @NotNull(message = "Inventory status should not be null")
    private InventoryStatus inventoryStatus;
    @NotNull(message = "Rating should not be null")
    @Min(value = 1, message = "Product rating must range from 1 to 5")
    @Max(value = 5, message = "Product rating must range from 1 to 5")
    private Integer rating;
    private Long createdAt;
    private Long updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getInternalReference() {
        return internalReference;
    }

    public void setInternalReference(String internalReference) {
        this.internalReference = internalReference;
    }

    public Integer getShellId() {
        return shellId;
    }

    public void setShellId(Integer shellId) {
        this.shellId = shellId;
    }

    public InventoryStatus getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(InventoryStatus inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }
}
