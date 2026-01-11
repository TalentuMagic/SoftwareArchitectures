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
public class Customer implements Observer{
    private String name;
    @Override
    public void update(String message) {
        System.out.println(String.format("Customer %s notified: %s",name,message));
    }
}
