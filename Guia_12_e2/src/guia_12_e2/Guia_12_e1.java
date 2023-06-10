package guia_12_e2;

import guia_12_e1.Entidad.Electrodomestico;
import guia_12_e1.Entidad.Lavadora;
import guia_12_e1.Entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Guia_12_e1 {

    /**
     * @param args the command line arguments Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
     */
    public static void main(String[] args) {

        ArrayList<Electrodomestico> e = new ArrayList<>();

        Lavadora l1 = new Lavadora();

        l1.crearLavadora(67, 1000d, "Negro", "a", 50);

        e.add(l1);

        Lavadora l2 = new Lavadora();

        l2.crearLavadora(20, 1000d, "amarillo", "c", 15);
        e.add(l2);

        Televisor tv = new Televisor();
        tv.crearTelevisor(45d, true, 1000.00, "Negro", "a", 30);

        e.add(tv);

        Televisor tv1 = new Televisor();
        tv1.crearTelevisor(56d, false, 1000d, "Balnco", "b", 24);
        e.add(tv1);
        double preTotal=0;
        double lavPre = 0;
        double tvPre = 0;
        for (int i = 0; i < e.size(); i++) {
            
            preTotal+= e.get(i).getPrecio();
            
            
            if (e.get(i) instanceof Lavadora) {
                lavPre+= e.get(i).getPrecio();
            } 
            if (e.get(i) instanceof Televisor) {
                tvPre += e.get(i).getPrecio();
            }
            
        
        }
        
        
        System.out.println("El total de precios de los electrodomesticos es de $ " +preTotal);
        System.out.println("El precio de Lavadoras es $ " + lavPre);
        System.out.println("El precio de Televisores es $ " +tvPre);
    }

}
