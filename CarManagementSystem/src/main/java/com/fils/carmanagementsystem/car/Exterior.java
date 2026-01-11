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
public class Exterior {
    private String colour;
    private String tyreSize;
    private int wheelRimSize_inch;
    
    @Override
    public String toString(){
        return String.format("----\n"
                + "Exterior:\n"
                + "Colour: %s\n"
                + "Tyre Size: %s\n"
                + "Wheel Rim Size (inch): %d\n"
                + "----\n",colour,tyreSize,wheelRimSize_inch);
    }
}
