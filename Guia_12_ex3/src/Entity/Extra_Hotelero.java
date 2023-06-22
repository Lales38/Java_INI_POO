package Entity;

public class Extra_Hotelero extends Alojamiento {

    protected boolean privado;

    protected Integer mCuadrados;

    public Extra_Hotelero() {
    }

    public Extra_Hotelero(boolean privado, Integer mCuadrados) {
        this.privado = privado;
        this.mCuadrados = mCuadrados;
    }

    public Extra_Hotelero(boolean privado, Integer mCuadrados, String nombre, String direcion, String lujar, String gerente) {
        super(nombre, direcion, lujar, gerente);
        this.privado = privado;
        this.mCuadrados = mCuadrados;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public Integer getmCuadrados() {
        return mCuadrados;
    }

    public void setmCuadrados(Integer mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    @Override
    public String toString() {
        return "Extra_Hotelero{" + "privado=" + privado + ", mCuadrados=" + mCuadrados + '}';
    }
    
    
    
}
