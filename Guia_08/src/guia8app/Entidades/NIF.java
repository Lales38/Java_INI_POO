/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF).
Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde.
*/

package guia8app.Entidades;

/**
  * @author Alejandro
 */
public class NIF {
    
    private long dni;
    private String letra;
   

    public NIF() {
    }

  
    

    public NIF(long dni, String letra, String[] vnif) {
        this.dni = dni;
        this.letra = letra;
        
    }

    public NIF(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

 
   

   
}
