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
public class Guerrero extends Personaje{
    boolean Caballo;

    public Guerrero(int x, int y, String nick) {
        super(x, y, nick);
        Caballo = true;
    }
    
    @Override
    public void Avanzar(){
        if (Caballo){
            System.out.println("A caballo...mueves de a 10!");
            if(orientacion=='N') x+=10;
            else if(orientacion=='E') y+=10;
            else if(orientacion=='S') x-=10;
            else y-=10;
            System.out.println("Pos X: "+x +" "+ "PosY: "+y);
        }else super.Avanzar();
    }
/*Con los métodos: Sobreecribir el comportamiento de Avanzar para que si tiene un
caballo avanzará de a 10 pasos caso contrario se comportará como el método de la
clase padre. Sobreecribir el comportamiento de Disparar para que si tiene menos
de 30 unidades de energía pierda el caballo.*/
    @Override
    public void Disparar(){
        if(energia<30){
            Caballo=false;
            System.out.println("Has perdido tu caballo! Quedan "+energia+ " de energía!");
        } 
        super.Disparar();
    }
}
