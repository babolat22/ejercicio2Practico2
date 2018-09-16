/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootp2.e2.videojuego;

/**
 *
 * @author juanj
 */
public class TestHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        Guerrero guerrero = new Guerrero(100,200,"Witcher");
        System.out.println("Bienvenido guerrero: "+guerrero.nick);
        for(i=0; i<3; i++) 
            guerrero.Girar();
        System.out.println("Mirando hacia: "+guerrero.orientacion);
        for(i=0; i<3; i++) 
            guerrero.Avanzar();
        System.out.println("Pos X: "+guerrero.x +" "+ "PosY: "+guerrero.y);
        for(i=0; i<9; i++) 
            guerrero.Disparar();
        System.out.println("Energia Actual luego de disparos: " + guerrero.energia);
        // se mueve a pie
        for(i=0; i<3; i++) 
            guerrero.Avanzar();
        
    }
    
}
