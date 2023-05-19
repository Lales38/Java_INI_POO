package guia_9.Servicios;

import guia_9.Entidades.Cadena;
import java.util.Scanner;

/**
 * @author Alejandro Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos: . . Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no. *
 */
public class CadenaServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Cadena ca = new Cadena();

    public Cadena crearCad() {
        System.out.println("Ingrese la frase deseada:");
        System.out.print(">>");
        ca.setFrase(read.nextLine());
        ca.setLargo(ca.getFrase().length());

        //System.out.println(ca.getFrase());
        //System.out.println(ca.getLargo());
        return ca;
    }

    /*
    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
     */
    public void mostrarVocales(Cadena c1) {
        int a = 0;
        String fra = ca.getFrase();
        for (int i = 0; i < ca.getLargo(); i++) {
            if (fra.charAt(i) == 'a' || fra.charAt(i) == 'e' || fra.charAt(i) == 'i' || fra.charAt(i) == 'o' || fra.charAt(i) == 'u') {
                a++;
            }
        }
        System.out.println("La cantidad de vocales es: " + a);
    }

    /*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac"
     */
    public void invertirFrase(Cadena c1) {

        for (int i = c1.getLargo(); i > 0; i--) {
            System.out.print(c1.getFrase().substring((i - 1), i));
        }
        System.out.println(" ");

    }

    /*
 Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar 
cuántas veces se repite el carácter en la frase, por ejemplo: Entrada: frase = "casa blanca". 
Salida: El carácter 'a' se repite 4 veces.
     */
    public void vecesRepetido(Cadena c1) {
        System.out.println("Ingrese el caracter a contabilizar: ");
        System.out.print(">>");
        String letra = read.next();
        String fra = c1.getFrase();
        int a = 0;
        for (int i = 0; i < c1.getLargo(); i++) {
            if (fra.charAt(i) == letra.charAt(0)) {
                a++;
            }
        }
        System.out.println("La cantidad de veces repetidas es: " + a);
    }

    /*
    Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase
    con otra nueva frase ingresada por el usuario
     */
    public void compararLong(Cadena c1) {

        System.out.println("Ingrese segunda frase: ");
        System.out.print(">>");
        String f2 = read.nextLine();
        System.out.println("La frases son iguales: " + f2.equals(c1.getFrase()));
    }

    /*
 Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario 
y mostrar la frase resultante. 
     */
    public void unirFrase(Cadena c1) {
        System.out.println("Ingrese una frase: ");
        System.out.print(">>");
        String f2 = read.nextLine();
        System.out.println(c1.getFrase().concat(f2));

    }

    /*
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase , 
por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
     */
    public void reemplazar(Cadena c1) {
        System.out.println("Ingrese la letra a reemplazar:");
        System.out.print(">>");
        String let = read.next();
        String f1 = c1.getFrase();
        f1 = f1.replaceAll("a", let);
        System.out.println(f1);
    }

    /*
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario 
y devuelve verdadero si la contiene y falso si no.
     */
    public void contiene(Cadena c1) {
        System.out.println("Ingrese la letra a buscar:");
        System.out.print(">>");
        String l = read.next();
        boolean ban = false;

        for (int i = 0; i < c1.getLargo(); i++) {
            if (c1.getFrase().charAt(i) == l.charAt(0)) {
                ban = true;
            }
        }
        System.out.println("La letra ingresada esta dentro de la frase:"+ ban);
    }

    private boolean substring(String frase, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
