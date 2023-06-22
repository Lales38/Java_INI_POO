package Entity;

public class Residencias extends Extra_Hotelero{

    private Integer nHabitaciones;

    private boolean descGremios;

    private boolean CampoDepor;

    public Residencias() {
    }

    public Residencias(Integer nHabitaciones, boolean descGremios, boolean CampoDepor) {
        this.nHabitaciones = nHabitaciones;
        this.descGremios = descGremios;
        this.CampoDepor = CampoDepor;
    }

    public Residencias(Integer nHabitaciones, boolean descGremios, boolean CampoDepor, boolean privado, Integer mCuadrados) {
        super(privado, mCuadrados);
        this.nHabitaciones = nHabitaciones;
        this.descGremios = descGremios;
        this.CampoDepor = CampoDepor;
    }

    public Residencias(Integer nHabitaciones, boolean descGremios, boolean CampoDepor, boolean privado, Integer mCuadrados, String nombre, String direcion, String lujar, String gerente) {
        super(privado, mCuadrados, nombre, direcion, lujar, gerente);
        this.nHabitaciones = nHabitaciones;
        this.descGremios = descGremios;
        this.CampoDepor = CampoDepor;
    }

    public Integer getnHabitaciones() {
        return nHabitaciones;
    }

    public void setnHabitaciones(Integer nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    public boolean isDescGremios() {
        return descGremios;
    }

    public void setDescGremios(boolean descGremios) {
        this.descGremios = descGremios;
    }

    public boolean isCampoDepor() {
        return CampoDepor;
    }

    public void setCampoDepor(boolean CampoDepor) {
        this.CampoDepor = CampoDepor;
    }

    @Override
    public String toString() {
        return "Residencias{" + "nHabitaciones=" + nHabitaciones + ", descGremios=" + descGremios + ", CampoDepor=" + CampoDepor + '}';
    }
    
}
