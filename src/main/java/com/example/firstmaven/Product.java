package com.example.firstmaven;

public class Product {
    private int id;
    private String prodName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product() {
        // this.id = 1;
        // this.prodName = "Samsung";
    }

    public Product(int id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public Product(int id, String prodName) {
        this.id = id;
        this.prodName = prodName;
        System.out.println("From 2 args cons");
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", prodName=" + prodName + "]";
    }

}
