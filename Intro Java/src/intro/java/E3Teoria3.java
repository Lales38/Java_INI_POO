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
public class E3Teoria3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, i;
        int result;
        result = 0;
        i=0;
        num=11;
        Scanner read = new Scanner(System.in);
        
        while(num!=0 && i<20)   {
            System.out.println("Ingrese un número entero: ");
            num = read.nextInt();
                               
            if (num==0) {
                System.out.println("Se capturo el cero.");  
                break;
            }
            if (num>0) {
                result=result +num;
            }
            i=i+1;
            //System.out.println("el valor i es " + i);
        } 
        
        System.out.println("La suma de los numeros ingresados es:" + result);
        }
       
}