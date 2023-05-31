package guia_11.Main;

import Entity.Baraja;
import EntityService.BarajaService;
import java.util.Scanner;
/**
 * @author Alejandro
 */
public class G11_3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        BarajaService bs = new BarajaService();
        Baraja baraja1 = bs.crearBaraja();
        boolean bucle = true;
        do {
            System.out.println("1- Barajar");
            System.out.println("2- Ver cartas disponible");
            System.out.println("3- Dar cartas");
            System.out.println("4- Cartas desechadas");
            System.out.println("5- Mostrar baraja");
            System.out.println("Cualquier número para salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    bs.barajar(baraja1);
                    break;
                case 2:
                    bs.cartasDisponibles(baraja1);
                    break;
                case 3:
                    bs.darCartas(baraja1);
                    break;
                case 4:
                    bs.cartasMonton(baraja1);
                    break;
                case 5:
                    bs.mostrarBaraja(baraja1);
                    break;
                default:
                    bucle = false;
            }
        } while (bucle);
    }


    }


