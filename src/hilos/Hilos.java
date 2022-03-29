/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chris
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("El proceso main empieza");
        try {
            Salut slt = new Salut();
            slt.start();
            
            Thread.sleep(1000);
          
            System.out.println("El proceso main va a terminar");
              System.out.println("Espero al hilo...");
              slt.join();
              System.out.println("El hilo ha terminado");
//        for (int i = 0; i < 5; i++) {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//            System.out.println(i);
//        }
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}

class Salut extends Thread{
        
        public void run(){
            System.out.println("Class saluda");
        }
    }
