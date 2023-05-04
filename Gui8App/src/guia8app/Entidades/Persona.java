package guia8app.Entidades;

import java.util.Scanner;

/**
 * @author Alejandro
 */
public class Persona {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private int edad;

    public Persona() {
        
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int edad, String sexo, int peso, int altura) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

        public void creaPersona(){
            
        }

    @Override
    public String toString() {
        return "Persona{" + "read=" + read + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

    
    
    
    
        
}
