package com.example.demo;

public class Repair {

    private int id;
    private String customerName;
    private String productName;
    private String status;

    public Repair(int id, String customerName, String productName, String status) {
        this.id = id;
        this.customerName = customerName;
        this.productName = productName;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProductName() {
        return productName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}