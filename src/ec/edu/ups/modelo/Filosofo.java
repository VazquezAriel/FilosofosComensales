/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ariel
 */
public class Filosofo extends Thread {

    private Random random = new Random();
    private String nombre;
    private int contador;
    private Tenedor tenIzquieda;
    private Tenedor tenDerecha;
    private Comedor comedor;
    private JTextField jTextField_Contador;
    private JTextField jTextField_Estado;
    private JTextArea jTextArea_Mensajes;
    public static boolean finalizado = false;

    public Filosofo(String nombre, Tenedor dcha, Tenedor izqda, JTextField jTextField_C, JTextField jTextField_Estado, Comedor comedor, JTextArea jTextArea) {
        this.nombre = nombre;
        this.tenDerecha = dcha;
        this.tenIzquieda = izqda;
        this.jTextField_Estado = jTextField_Estado;
        this.jTextField_Contador = jTextField_C;
        this.jTextArea_Mensajes = jTextArea;
        this.contador = 0;
        this.comedor = comedor;
    }

    @Override
    public void run() {
        while (true) {

            try {
                comedor.alistarse();
                this.tenDerecha.cogerTenedor();

                if (!tenIzquieda.cogerTenedorIzqdo()) {

                    tenDerecha.soltarTenedor();
                    comedor.desalistarse();

                    try {
                        Filosofo.sleep(random.nextInt(1000) + 100);
                    } catch (InterruptedException ex) {
                        System.out.println("Ha ocurrido un error: " + ex.toString());
                    }
                    continue;
                }

                this.jTextField_Estado.setText("Comiendo.....");
                this.jTextArea_Mensajes.setText(this.jTextArea_Mensajes.getText() + "\n" + nombre + ":  Esta comiendo...");
                this.contador++;
                this.jTextField_Contador.setText(contador + "");

                try {
                    sleep(random.nextInt(1000) + 500);
                } catch (InterruptedException ex) {
                    System.out.println("Ha ocurrido un error:" + ex.toString());
                }

                tenDerecha.soltarTenedor();
                tenIzquieda.soltarTenedor();
                comedor.desalistarse();

                this.jTextField_Estado.setText("Pensando.....");
                this.jTextArea_Mensajes.setText(this.jTextArea_Mensajes.getText() + "\n" + nombre + ":  Esta Pensando...");

                try {
                    Filosofo.sleep(random.nextInt(4000) + 1000);
                } catch (InterruptedException ex) {
                    System.out.println("Ha ocurrido un error: " + ex.toString());
                }

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            if (finalizado) {
                this.jTextField_Estado.setText("Pensando.....");
                this.jTextArea_Mensajes.setText(this.jTextArea_Mensajes.getText() + "\n" + nombre + ":  Esta Pensando...");
                break;
            }
        }
    }
}
