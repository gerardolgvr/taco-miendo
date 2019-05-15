package com.example.tacomiendo.Models;

public class Address {
    private int id;
    private String address;
    private String neighborhood;
    private String city;
    private String telephone;

    public Address(){

    }

    public Address(int id, String address, String neighborhood, String city, String telephone) {
        this.id = id;
        this.address = address;
        this.neighborhood = neighborhood;
        this.city = city;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
