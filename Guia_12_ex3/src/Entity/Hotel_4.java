package Entity;

public class Hotel_4 extends Hoteles {

    protected String gimnasio;

    protected String NombreRestaurent;

    protected Integer CapacidadRest;

    public Hotel_4() {
        
    }

    public Hotel_4(String gimnasio, String NombreRestaurent, Integer CapacidadRest) {
        this.gimnasio = gimnasio;
        this.NombreRestaurent = NombreRestaurent;
        this.CapacidadRest = CapacidadRest;
    }

    public Hotel_4(String gimnasio, String NombreRestaurent, Integer CapacidadRest, Integer nHabitacion, Integer nCamas, Integer nPisos, Double costoHabitacion) {
        super(nHabitacion, nCamas, nPisos, costoHabitacion);
        this.gimnasio = gimnasio;
        this.NombreRestaurent = NombreRestaurent;
        this.CapacidadRest = CapacidadRest;
    }

    public Hotel_4(String gimnasio, String NombreRestaurent, Integer CapacidadRest, Integer nHabitacion, Integer nCamas, Integer nPisos, Double costoHabitacion, String nombre, String direcion, String lujar, String gerente) {
        super(nHabitacion, nCamas, nPisos, costoHabitacion, nombre, direcion, lujar, gerente);
        this.gimnasio = gimnasio;
        this.NombreRestaurent = NombreRestaurent;
        this.CapacidadRest = CapacidadRest;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurent() {
        return NombreRestaurent;
    }

    public void setNombreRestaurent(String NombreRestaurent) {
        this.NombreRestaurent = NombreRestaurent;
    }

    public Integer getCapacidadRest() {
        return CapacidadRest;
    }

    public void setCapacidadRest(Integer CapacidadRest) {
        this.CapacidadRest = CapacidadRest;
    }

    @Override
    public String toString() {
        return "Hotel_4{" + "gimnasio=" + gimnasio + ", NombreRestaurent=" + NombreRestaurent + ", CapacidadRest=" + CapacidadRest + '}';
    }
    
}
