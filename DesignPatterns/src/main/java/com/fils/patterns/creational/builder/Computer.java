/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.patterns.creational.builder;
import lombok.AllArgsConstructor;
/**
 *
 * @author davidioans
 */
@AllArgsConstructor
public class Computer {
    private String CPU;
    private String RAM;
    private String Storage;
    
    public static class Builder {
        private String CPU;
        private String RAM;
        private String Storage;
        
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }
        
        public Builder setStorage(String storage){
            this.Storage = storage;
            return this;
        }
        
        public Computer build(){
            return new Computer(this);
        }
    }
    
    private Computer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
    }
    
    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + Storage + "]";
    }
}
