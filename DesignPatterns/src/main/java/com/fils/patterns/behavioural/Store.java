/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fils.patterns.behavioural;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author davidioans
 */
@Getter @Setter
public class Store {
    private List<Observer> observers = new ArrayList<>();
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void notifyObservers(String message){
        for (Observer observer: observers){
            observer.update(message);
        }
    }
}
