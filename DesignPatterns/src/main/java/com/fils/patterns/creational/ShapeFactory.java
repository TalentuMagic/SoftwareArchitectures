/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.patterns.creational;

/**
 *
 * @author davidioans
 */
public class ShapeFactory {
    public Shape createShape(String shapeType){
        switch (shapeType) {
            case "Circle":
                return new Circle();
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}
