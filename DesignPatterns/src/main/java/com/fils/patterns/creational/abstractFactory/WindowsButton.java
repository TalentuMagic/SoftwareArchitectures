/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.patterns.creational.abstractFactory;

/**
 *
 * @author davidioans
 */
public class WindowsButton implements Button {
    @Override
    public void create(){
        System.out.println("Creating a Windows button");
    }
}
