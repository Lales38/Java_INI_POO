package guia_9_e5persona.Entidades;

import java.util.Date;

/**
  * @author Alejandro
  * Implemente la clase Persona en el paquete entidades. 
  * Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
  * constructor vacío, constructor parametrizado, get y set. 
 */
public class Persona {
    private String nombre;
    private Date nacimiento= new Date();

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

   public void setFechaNacimiento(int d, int m, int a) {
        this.nacimiento = new Date(a - 1900, m - 1, d);
   }

}
