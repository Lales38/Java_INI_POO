/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g12_1;

/**
 *
 * @author Alejandro
 */
public class G12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Animal pe1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        //System.out.println(pe1.alimentarse());
        pe1.alimentarse();
        
        Animal pe2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        pe2.alimentarse();
        
        Animal ga1 = new Gato("Pelusa ", "Galletas", 15, "Siames");
        ga1.alimentarse();
        
        Animal ca1 = new Caballo("Spark", "Pasto", 25, "Fino");
        ca1.alimentarse();
        
        
        
        
        
        
        
    }
    
}
