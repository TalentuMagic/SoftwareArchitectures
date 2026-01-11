/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fils.patterns;
import com.fils.patterns.behavioural.*;
import com.fils.patterns.creational.*;
import com.fils.patterns.creational.abstractFactory.*;
import com.fils.patterns.creational.builder.*;
/**
 *
 * @author davidioans
 */
public class Patterns {

    public static void main(String[] args) {
        // Behavioural Patterns
        // Chain of Responsibility
        AuthHandler auth = new AuthHandler();
        auth.handleRequest("auth token");
        
        // Command
        Command paste = new PasteCommand("Hello World!");
        paste.execute();
        
        // Observer
        Store store = new Store();
        Observer customer1 = new Customer("Marian");
        Observer customer2 = new Customer("Andrei");
        store.addObserver(customer1); store.addObserver(customer2);
        
        store.notifyObservers("HEY! A NEW PRODUCT IS AVAILABLE!\nCHECK IT OUT NOW!");
        
        // Strategy
        Strategy card = new Payment("1234-2345-3456-4567");
        card.pay(150.0);
        
        // Creational Patterns
        // Singleton
        DBConnection connection1 = DBConnection.getInstance();
        connection1.query("SELECT * FROM users");
        DBConnection connection2 = DBConnection.getInstance();
        connection2.query("SELECT * FROM orders");

        System.out.println(connection1 == connection2);
        
        // Factory
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.createShape("Circle");
        shape1.draw();
        
        // Abstract Factory
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        button.create();
        
        // Builder
        Computer mypc = new Computer.Builder("Intel i7", "32GB")
                .setStorage("512GB SSD")
                .build();
        System.out.println(mypc);
        
        AutoComputer mypc_automated = AutoComputer.builder()
                .CPU("Intel i7")
                .RAM("32GB")
                .storage("512GB")
                .build();
        System.out.println("SECOND PC:"+mypc_automated);
    }
}
