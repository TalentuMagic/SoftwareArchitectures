/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.patterns.creational.builder;
import lombok.ToString;
import lombok.Builder;
/**
 *
 * @author davidioans
 */
@Builder
@ToString
public class AutoComputer {
    private String CPU;
    private String RAM;
    private String storage;
}
