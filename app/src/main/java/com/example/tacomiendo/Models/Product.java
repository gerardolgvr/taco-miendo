package com.example.tacomiendo.Models;

import java.util.ArrayList;

public class Product {
    private int id;
    private String name;
    private float price;
    private String category;
    private int imageId;

    // constructors
    public Product(){

    }

    public Product(int id, String name, float price, String category, int imageId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.imageId = imageId;
    }

    //getters and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

}
