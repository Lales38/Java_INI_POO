/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia_12_teoria;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Guia_12_Teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales =new ArrayList<>();
        
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for (Animal animale : animales) {
            System.out.println("animale = " + animale.hacerRuido());
        }
    }
    
}
