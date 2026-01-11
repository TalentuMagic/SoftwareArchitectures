/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.patterns.behavioural;

import lombok.AllArgsConstructor;

/**
 *
 * @author davidioans
 */
@AllArgsConstructor
public class PasteCommand implements Command {
    private String clipboard;
    
    
    @Override
    public void execute() {
        System.out.println("Pasting:" + clipboard);
    }
}