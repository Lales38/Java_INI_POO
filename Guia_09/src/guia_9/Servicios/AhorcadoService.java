package guia_9.Servicios;

import guia_9.Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class AhorcadoService {

    Scanner read = new Scanner(System.in);

    // punto A
    public Ahorcado crearJuego() {

        //Palabra perro
        //String frase = "perro"
        System.out.println("Ingrese la palabra: ");
        System.out.print(">>");
        String frase = read.nextLine();

        // cantidad de jugadas 6 intentos
        //int jugadas = 6;
        System.out.println("Ingrese la cantidad de intentos: ");
        System.out.print(">>");
        int jugadas = read.nextInt();

        //Determinamos el tamaño del vector
        String[] palabra = new String[frase.length()];

        for (int i = 0; i < palabra.length; i++) {
            palabra[i] = String.valueOf(frase.charAt(i));
        }
        System.out.println(Arrays.toString(palabra));
        System.out.println("Intentos: " + jugadas);
        System.out.println("");
        return new Ahorcado(palabra, jugadas);
    }

    // punto B Longitud
    public void longitudd(Ahorcado ob) {

        System.out.println("La long de la palabra es:" + ob.getCantLetras());

    }

    // punto C
    public void buscar(Ahorcado ob, String letra) {

        ob.getPalabra();

        for (int i = 0; i < ob.getCantLetras(); i++) {

            if (letra.equals(ob.getPalabra()[i])) {
                System.out.println("La letra se encuentra en la palabra");
                break;
            } else if (i == ob.getCantLetras() - 1) {
                System.out.println("No se encuentra la letra:" + letra);
            }
        }

    }

    // punto D
    public void encontradas(Ahorcado ob, String letra, String respu[]) {
        boolean cond = false;
        int xx = 0;

        for (int i = 0; i < ob.getCantLetras(); i++) {

            if (letra.equals(ob.getPalabra()[i])) {
                xx++;

                respu[i] = ob.getPalabra()[i];
                cond = true;
            }
        }
        ob.setLetrasEncontradas(ob.getLetrasEncontradas() + xx);

        if (xx == 0) {
            ob.setJugadas(ob.getJugadas() - 1);
        }

        System.out.println("Letras encontradas:" + ob.getLetrasEncontradas());
        System.out.println(Arrays.toString(respu));

    }

    // punto E Intentos
    public void intentos(Ahorcado ob) {

        System.out.println("Quedan: " + ob.getJugadas() + " intentos");

    }

    // punto F
    public void ajugar(Ahorcado ob) {

        // Vector respuesta con las letras q adivine
        String[] respu = new String[ob.getCantLetras()];
        for (int i = 0; i < respu.length; i++) {
            respu[i] = "_";
        }

        while (ob.getJugadas() != 0 && ob.getLetrasEncontradas() != respu.length) {

            System.out.println("Ingrese una letra");
            String letra = read.next();
            longitudd(ob);
            buscar(ob, letra);
            encontradas(ob, letra, respu);
            intentos(ob);
            System.out.println("");

        }

        if (ob.getLetrasEncontradas() == respu.length) {
            System.out.println("Adivinaste la palabra rey");
        } else {
            System.out.println("Perdiste rey");
        }

    }
}
