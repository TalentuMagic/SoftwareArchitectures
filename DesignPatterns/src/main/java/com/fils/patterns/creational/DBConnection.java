/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.patterns.creational;

/**
 *
 * @author davidioans
 */
public class DBConnection {
    private static DBConnection instance;
    
    private DBConnection(){
        System.out.println("DB Connection created!");
    }
    
    public static synchronized DBConnection getInstance(){
        if (instance == null){
            instance = new DBConnection();
        }
        return instance;
    }
    
    public void query(String sql) {
        System.out.println(String.format("Executing query\n%s", sql));
    }
}
