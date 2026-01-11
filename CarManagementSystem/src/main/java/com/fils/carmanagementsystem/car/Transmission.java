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
public class Transmission {
    private String type;
    private String traction;
    
    @Override
    public String toString(){
        return "----\nTransmission:\n"+ type + " " + traction+"\n----\n";
    }
}
