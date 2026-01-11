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
public class Engine implements StartStop {
    private int displacement;
    private String fuel;
    private int noCylinders;
    private boolean hasTurbo;
    private boolean hybrid;
    private boolean running;
    
    @Override
    public void StartStop(){
        if (this.running){
            this.running = false;
        } else {
            this.running = true;
        }  
    }
    
    @Override
    public String toString(){
        return String.format("----\n"
                + "Engine Specs:\n"
                + "Displacement: %d; Number of Cylinders: %d; Has Turbo: %b;\n"
                + "Fuel: %s\n"
                + "Hybrid: %b\n"
                + "Engine Running: %b\n"
                + "----\n", displacement, noCylinders, hasTurbo, fuel, hybrid, running);
    }
}
