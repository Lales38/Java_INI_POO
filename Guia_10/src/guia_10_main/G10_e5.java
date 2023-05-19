package guia_10_main;

import guia_10_Service.CountryService;
import guia_10_Object.Countries;
import java.util.HashSet;

/**
 * @author Alejandro
 */
public class G10_e5 {

    public static void main(String[] args) {

        CountryService country = new CountryService() ;
        HashSet<Countries> addCountry = new HashSet();

        country.addCountries(addCountry);
        country.showCountries(addCountry);
        country.orderABC(addCountry);
        country.searchCountry(addCountry);
        country.showCountries(addCountry);
        
    }

}
