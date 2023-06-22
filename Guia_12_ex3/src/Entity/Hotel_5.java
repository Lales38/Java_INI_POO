package Entity;

public class Hotel_5 extends Hotel_4 {

    private Integer nSalones;

    private Integer nSuite;

    private Integer NLimosina;

    public Hotel_5() {
    }

    public Hotel_5(Integer nSalones, Integer nSuite, Integer NLimosina) {
        this.nSalones = nSalones;
        this.nSuite = nSuite;
        this.NLimosina = NLimosina;
    }

    public Hotel_5(Integer nSalones, Integer nSuite, Integer NLimosina, String gimnasio, String NombreRestaurent, Integer CapacidadRest) {
        super(gimnasio, NombreRestaurent, CapacidadRest);
        this.nSalones = nSalones;
        this.nSuite = nSuite;
        this.NLimosina = NLimosina;
    }

    public Hotel_5(Integer nSalones, Integer nSuite, Integer NLimosina, String gimnasio, String NombreRestaurent, Integer CapacidadRest, Integer nHabitacion, Integer nCamas, Integer nPisos, Double costoHabitacion) {
        super(gimnasio, NombreRestaurent, CapacidadRest, nHabitacion, nCamas, nPisos, costoHabitacion);
        this.nSalones = nSalones;
        this.nSuite = nSuite;
        this.NLimosina = NLimosina;
    }

    public Hotel_5(Integer nSalones, Integer nSuite, Integer NLimosina, String gimnasio, String NombreRestaurent, Integer CapacidadRest, Integer nHabitacion, Integer nCamas, Integer nPisos, Double costoHabitacion, String nombre, String direcion, String lujar, String gerente) {
        super(gimnasio, NombreRestaurent, CapacidadRest, nHabitacion, nCamas, nPisos, costoHabitacion, nombre, direcion, lujar, gerente);
        this.nSalones = nSalones;
        this.nSuite = nSuite;
        this.NLimosina = NLimosina;
    }

    public Integer getnSalones() {
        return nSalones;
    }

    public void setnSalones(Integer nSalones) {
        this.nSalones = nSalones;
    }

    public Integer getnSuite() {
        return nSuite;
    }

    public void setnSuite(Integer nSuite) {
        this.nSuite = nSuite;
    }

    public Integer getNLimosina() {
        return NLimosina;
    }

    public void setNLimosina(Integer NLimosina) {
        this.NLimosina = NLimosina;
    }

    @Override
    public String toString() {
        return "Hotel_5{" + "nSalones=" + nSalones + ", nSuite=" + nSuite + ", NLimosina=" + NLimosina + '}';
    }
    
    
    
    
}
