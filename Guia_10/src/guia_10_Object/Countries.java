package guia_10_Object;

/**
  * @author Alejandro
 */
public class Countries {
    
    private String country;

    public Countries() {
    }

    public Countries(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Countries{" + "country=" + country + '}';
    }
    

}
