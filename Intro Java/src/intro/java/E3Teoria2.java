/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.java;

import java.util.Scanner;

/**
  * @author Alejandro
 */
public class E3Teoria2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int motor;
        System.out.println("Ingrese que tipo de motor desea:  ");
        
        Scanner read = new Scanner (System.in);
        motor = read.nextInt();
        
        switch (motor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
     
        } 

}
