/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dp_lab_final;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author skytech laptop store
 */
public class Appliication implements ApplicationStatusObserver {
    private List<ApplicationStatusObserver> observers = new ArrayList<>();
    private String status;

    public void addObserver(ApplicationStatusObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ApplicationStatusObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (ApplicationStatusObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

