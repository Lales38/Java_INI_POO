package guia_10_Object;

/**
 * @author Alejandro
 */
public class Produc {

    private String Prod;
    private Double Price;

    public Produc() {
    }

    public Produc(String Prod, Double Price) {
        this.Prod = Prod;
        this.Price = Price;
    }

    public String getProd() {
        return Prod;
    }

    public void setProd(String Prod) {
        this.Prod = Prod;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Produc{" + "Prod=" + Prod + ", Price=" + Price + '}';
    }

}
