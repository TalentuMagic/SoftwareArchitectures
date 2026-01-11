/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.carmanagementsystem.car;
import java.util.List;
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
public class Interior {
    private List<Seats> seats;
    private double diagonalInfotainmentDisplay;
    private int noSpeakers;
    private boolean heatedWindscreen;
}
