package Main;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;

/**
  * @author Alejandro
  * Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Edificio> edif = new ArrayList();
        
        Polideportivo p1 = new Polideportivo("Polis Reducidos", true, 5, 10, 8);
        Polideportivo p2 = new Polideportivo("Polis Multiples", false, 0, 30, 10);
        
        EdificioDeOficinas of1 = new EdificioDeOficinas(5, 3, 4, 12, 10, 6);
        EdificioDeOficinas of2 = new EdificioDeOficinas(7, 6, 2, 6, 15, 8);
        
        edif.add(p1);
        edif.add(p2);
        edif.add(of1);
        edif.add(of2);
        
        int cont =1; int techado=0; int aireLibre =0;
        
        for (Edificio edificio : edif) {
            
            System.out.println("La superficie del edificio "+ cont + " es: " + edificio.calcularSuperficie());
                       
            if (edificio.calcularVolumen()==0) {
                System.out.println("No se puede calcular el volumen ya que el edificio no es techado"); 
            }else{
                System.out.println("El volumen del edificio "+ cont + " es: " + edificio.calcularVolumen());

            }
            
            if (edificio instanceof Polideportivo) {
              if (((Polideportivo) edificio).isTechado()) {
                    techado++;
                }else{
                    aireLibre++;
                }               
              
            }else{
                EdificioDeOficinas aux = (EdificioDeOficinas)edificio;
                System.out.println("La  cantidad de personas par el edificio "+ cont + " es: " +aux.calcularCantPersonas() );
            }
            System.out.println("--------------------------------------------------");
            System.out.println(" ");
            cont++; 
        }
        
        System.out.println("Los Polideportivos techados son: "+ techado);
        System.out.println("Los Polideportivos sin techo son: "+ aireLibre);
        
    }

}
