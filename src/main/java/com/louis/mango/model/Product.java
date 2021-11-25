package com.louis.mango.model;

public class Product {
    private Long id;
    private String name;
    private Long brandId;

    private String brandName;

    public Product(Long id, String name, Long brandId, String brandName) {
        this.id = id;
        this.name = name;
        this.brandId = brandId;
        this.brandName = brandName;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
