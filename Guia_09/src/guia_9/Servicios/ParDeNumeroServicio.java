/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.ParDeNumero;

/**
 *
 * @author pauvi
 */
public class ParDeNumeroServicio {
   
    private ParDeNumero par;
    
    public ParDeNumeroServicio(){
        par = new ParDeNumero();
    }
     /*
    Método mostrarValores que muestra cuáles son los dos números guardados.
    */
    
    public void mostrarValores(){
        System.out.println("El valor del numero 1 es : " + par.getNumero1());
        System.out.println("El valor del numero 2 es: " + par.getNumero2());
    }
    
    /*
    Método devolverMayor para retornar cuál de los dos atributos 
    tiene el mayor valor
    */
    public double devolverMayor(){
        if (par.getNumero1() > par.getNumero2()) {
            return par.getNumero1();
        }else{
            return par.getNumero2();
        }
    }
    
    /*
    Método calcularPotencia para calcular la potencia del mayor valor de la
    clase elevado al menor número. Previamente se deben redondear ambos valores.
    */
    
    public double devolverMenor(){
        if (par.getNumero1() < par.getNumero2()) {
            return par.getNumero1();
        }else{
            return par.getNumero2();
        }
    }
    
    public double calcularPotencia(){
       double mayor = Math.round(devolverMayor());
       double menor = Math.round(devolverMenor());
       
      return Math.pow(mayor, menor);
       
    }
    
    /*
    Método calculaRaiz, para calcular la raíz cuadrada del menor de los
    dos valores. Antes de calcular la raíz cuadrada se debe obtener el
    valor absoluto del número.
    */
    
    public double calculaRaiz(){
        double menor = Math.abs(devolverMenor());
        
        return Math.sqrt(menor);
    }
    
}
