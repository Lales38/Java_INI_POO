package Main;

import Service.AlquilerService;

/**
  * @author Alejandro
 */
public class Main {
    public static void main(String[] args) {
      
        AlquilerService as = new AlquilerService();
        as.crearBarco();
        as.crearCliente();
        as.calcularAlquiler();
        
        
        
        
    }

}
