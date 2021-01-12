/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author ariel
 */
public class Comedor {
    private int comensalesDisponibles = 4;
    
    public synchronized void alistarse() throws InterruptedException{
        while(comensalesDisponibles==0){
            this.wait();
        } 
        comensalesDisponibles--;
    }
    
    public synchronized void desalistarse() throws InterruptedException{
        comensalesDisponibles++;
        this.notify();
    }
}
