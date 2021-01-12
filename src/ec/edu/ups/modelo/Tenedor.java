/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Random;

/**
 *
 * @author ariel
 */
public class Tenedor {
    private Random random = new Random();
    private int id;
    private boolean libre;
    
    public Tenedor(int id){
        this.id = id;
        this.libre = true;
    }
    
    public synchronized void cogerTenedor() throws InterruptedException{
        while(!libre) 
            this.wait();
        libre = false;
    }
    public synchronized boolean cogerTenedorIzqdo() throws InterruptedException{
        while(!libre){
            this.wait(random.nextInt(1000) + 500);
            return false;
        }
        libre = false;
        return true;
    }
    public synchronized void soltarTenedor() throws InterruptedException {
        libre = true;
        this.notify();
    }
}
