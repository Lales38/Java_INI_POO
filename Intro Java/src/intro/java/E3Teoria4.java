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
public class E3Teoria4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nota;
        do
        {
            System.out.println("Ingrese una nota: "); 
            Scanner read = new Scanner (System.in);
            
            nota = read.nextInt();
            
        } while (nota >= 10 || nota <=1);          
                                 
                   
        System.out.println("La nota es valida");
    }
}
