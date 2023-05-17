package guia_10_e1.RazaPerro;

/**
  * @author Alejandro
 */
public class RazaPerro {
    
    private String raza;

    public RazaPerro() {
    }

    public RazaPerro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "RazaPerro{" + "raza=" + raza + '}';
    }
    
    
               

}
