/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.patterns.behavioural;

import lombok.Setter;

/**
 *
 * @author davidioans
 */
@Setter
public abstract class Behavioural {
    protected Behavioural handler;

    public void setNext(Behavioural next){
        this.handler = next;
    }

    public void handleRequest(String request){
        if (handler != null) {
            handler.handleRequest(request);
        }
    }
}
