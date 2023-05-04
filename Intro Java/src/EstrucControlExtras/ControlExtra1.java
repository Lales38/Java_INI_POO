/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
package EstrucControlExtras;

import java.util.Scanner;
/**
 *
 * @author Alejandro
 */
public class ControlExtra1 {
    
     public static void main(String[] args){
         
         Scanner read = new Scanner(System.in);
         System.out.println("Ingrese la cantidad de minutos:");
         int minutos = read.nextInt();
         int dia= minutos/(60*24);
         int hora=minutos-(60*24);
         hora=hora/60;
         
         System.out.println("Equivale :" + dia + " día," + hora +" horas");
        
         
         
     }
    
}
