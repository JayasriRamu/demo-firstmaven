package com.example.firstmaven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World from spring application!");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
        context.registerShutdownHook();
        // Truck truck = new Truck();

        Truck truck = (Truck) context.getBean("truck-class");
        truck.deliver();

        context.close();
       
    }
}
