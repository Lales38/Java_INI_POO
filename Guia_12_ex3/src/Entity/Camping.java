package Entity;

public class Camping extends Extra_Hotelero{

    private Integer nMaxCarpa;

    private Integer Banio;

    private boolean restaurant;

    public Camping() {
    }

    public Camping(Integer nMaxCarpa, Integer Banio, boolean restaurant) {
        this.nMaxCarpa = nMaxCarpa;
        this.Banio = Banio;
        this.restaurant = restaurant;
    }

    public Camping(Integer nMaxCarpa, Integer Banio, boolean restaurant, boolean privado, Integer mCuadrados) {
        super(privado, mCuadrados);
        this.nMaxCarpa = nMaxCarpa;
        this.Banio = Banio;
        this.restaurant = restaurant;
    }

    public Camping(Integer nMaxCarpa, Integer Banio, boolean restaurant, boolean privado, Integer mCuadrados, String nombre, String direcion, String lujar, String gerente) {
        super(privado, mCuadrados, nombre, direcion, lujar, gerente);
        this.nMaxCarpa = nMaxCarpa;
        this.Banio = Banio;
        this.restaurant = restaurant;
    }

    public Integer getnMaxCarpa() {
        return nMaxCarpa;
    }

    public void setnMaxCarpa(Integer nMaxCarpa) {
        this.nMaxCarpa = nMaxCarpa;
    }

    public Integer getBanio() {
        return Banio;
    }

    public void setBanio(Integer Banio) {
        this.Banio = Banio;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Camping{" + "nMaxCarpa=" + nMaxCarpa + ", Banio=" + Banio + ", restaurant=" + restaurant + '}';
    }
    
}
