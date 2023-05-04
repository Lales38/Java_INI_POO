/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2guia9;


import Servicios.ParDeNumeroServicio;

/**
 *
 * @author pauvi
 */
public class Ejercicio2Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumeroServicio par1 = new ParDeNumeroServicio();
        
       par1.mostrarValores();
       
        System.out.println("El numero mayor es: " + par1.devolverMayor());
        System.out.println("El numero elevado quedo: " + par1.calcularPotencia());
        System.out.println("La raiz del numero: " + par1.calculaRaiz());
        
    }
    
}
