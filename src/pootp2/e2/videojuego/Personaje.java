package pootp2.e2.videojuego;

/**
 *
 * @author juanj
 */
public class Personaje {
    int x;
    int y;
    String nick;
    int vidas;
    int energia;
    char orientacion;
  
    public Personaje(int x, int y, String nick) {
        this.x = x;
        this.y = y;
        this.nick = nick;
        this.vidas = 3;
        this.energia = 100;
        this.orientacion = 'N';
    }
//Disparar que consume 10 unidades de energía y podrá disparar hasta que consuma toda su energía.
    public void Disparar(){
        if(energia>=10){
            energia-=10;
            System.out.println("-10 de energia. 1 Disparo. Energía: " + energia); 
        }
    }
    //Girar que cambia secuencialmente de orientación N, E, S, O y vuelve nuevamente N,E,S,O…..
    public void Girar(){
        if(orientacion=='N') orientacion='E';
        else if(orientacion=='E') orientacion='S';
        else if(orientacion=='S') orientacion='O';
        else orientacion='N';
    }
/*Avanzar que si el personaje está mirando hacia el norte: decrece en 1 el valor Y de su posición; 
    si está mirando al Sur: crece en 1 el valor de Y, para Este y Oeste.*/
    public void Avanzar(){
        switch (orientacion) {
            case 'N':
                x++;
                break;
            case 'E':
                y++;
                break;
            case 'S':
                x--;
                break;
            default:
                y--;
                break;
        }
        System.out.println("Lento, lento.. X: "+x +" "+ ", Y: "+y);
}
}
