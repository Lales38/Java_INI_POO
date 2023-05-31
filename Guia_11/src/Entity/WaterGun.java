package Entity;

import java.util.concurrent.ThreadLocalRandom;

/**
  * @author Alejandro
  * Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
* 



 */
public class WaterGun {
   private int posActual;
   private int posAgua;
   
// llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores deben ser aleatorios.


   public void llenarRevolver(){
       
       ThreadLocalRandom aleatorio = ThreadLocalRandom.current();
        this.posActual = aleatorio.nextInt(1, 7); 
        this.posAgua = aleatorio.nextInt(1, 7);
   }
   
// • mojar(): devuelve true si la posición del agua coincide con la posición actual   
   public boolean mojar (){
       
       return(this.posActual==this.posAgua);
       
   }
   //• siguienteChorro(): cambia a la siguiente posición del tambor
   
   public void nextShoot (){
       if (this.posActual==6) {
         this.posActual=1;  
       }else{
           this.posActual++;
       }
       
   }
   
   //• toString(): muestra información del revolver (posición actual y donde está el agua)
   
   public void showPosition(){
       System.out.println("Las posiciones son:");
       System.out.println("this.posActual = " + this.posActual);
       System.out.println("this.posAgua = " + this.posAgua);
       System.out.println("--------------------");
       
   }

    public WaterGun() {
    }

    public WaterGun(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "WaterGun{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }
   
   
}


