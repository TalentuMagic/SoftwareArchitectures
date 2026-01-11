/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.patterns.behavioural;

/**
 *
 * @author davidioans
 */
public class AuthHandler extends Behavioural {
    @Override
    public void handleRequest (String request) {
        if (request.contains("auth")) {
            System.out.println("Authentication Successful!");
        } else {
            System.out.println("Authentication Failed.");
        }
    }
}
