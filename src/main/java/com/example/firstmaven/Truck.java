package com.example.firstmaven;

import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Truck implements Transport,InitializingBean, DisposableBean {

    private Product product1;
    private Product product2;
    private Product product3;

    public Product getProduct3() {
        return product3;
    }

    public void setProduct3(Product product3) {
        this.product3 = product3;
    }

    public Product getProduct1() {
        return product1;
    }

    public void setProduct1(Product product1) {
        this.product1 = product1;
    }

    public Product getProduct2() {
        return product2;
    }

    public void setProduct2(Product product2) {
        this.product2 = product2;
    }

    public Truck() {
    }

    public Truck(Product product2) {
        this.product2 = product2;
    }

    public void deliver() {
        System.out.println("Prod 1 " + product1);
        System.out.println("Prod 2 " + product2);
        System.out.println("Prod 3 " + product3);

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("after destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After properties set");
    }

    public void myInit() {
        product2.setProdName(product2.getProdName().toUpperCase());
        product3.setProdName(product3.getProdName().toUpperCase());
        System.out.println("My Initializing bean");
    }

    public void myDestroy() {
        System.out.println("My destroy bean ");
    }

}