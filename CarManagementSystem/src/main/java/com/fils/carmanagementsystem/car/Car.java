/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.carmanagementsystem.car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 *
 * @author davidioans
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String model;
    private int productionYear;
    private Engine engineSpecs;
    private Transmission transmission;
    private Interior interiorFeatures;
    private Safety safetyFeatures;
    private Exterior exteriorOptions;
    
    @Override
    public String toString(){
        return String.format("----\n"
                + "Your configured %s, %d:\n"
                + "%s\n"
                + "%s\n"
                + "%s\n"
        , model, productionYear,engineSpecs,transmission,exteriorOptions);
    }
}
