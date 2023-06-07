package com.example.firstmaven;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ship implements Transport {

    private Product product1;

    public Ship() {
    }

    public Ship(Product product1) {
        this.product1 = product1;
    }

    public Product getProduct1() {
        return product1;
    }

    @Autowired
    @Qualifier("product2")
    public void setProduct(Product product1) {
        this.product1 = product1;
    }

    // @Resource
    public void deliver() {
        System.out.println("From ship delivery " + product1);

    }

    @Override
    public String toString() {
        return "Ship [product=" + product1 + "]";
    }

    @PostConstruct
    public void myInit() {
        System.out.println("Before initialization in ship");
    }

    @PreDestroy
    public void myDestroy() {
        System.out.println("after destroy in ship");

    }
}
