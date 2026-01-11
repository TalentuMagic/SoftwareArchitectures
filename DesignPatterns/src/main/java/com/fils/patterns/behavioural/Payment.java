/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.patterns.behavioural;
import lombok.AllArgsConstructor;

/**
 *
 * @author davidioans
 */
@AllArgsConstructor
public class Payment implements Strategy{
    private String cardNumber;
    
    @Override
    public void pay(double amount) {
        System.out.println(String.format("Paid $%f with Credit Card %s", amount, cardNumber));
    }
}
