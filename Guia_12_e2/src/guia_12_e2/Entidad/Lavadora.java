package guia_12_e2.Entidad;

import java.util.Scanner;

/**
 * @author Alejandro A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga, además de los atributos heredados. Los constructores que se implementarán serán: • Un constructor vacío. • Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
 */
public class Lavadora extends Electrodomestico {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, String color, String clasifEnerg, Integer peso) {
        super(precio, color, clasifEnerg, peso);
        this.carga = carga;

    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    /*
    • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
     */
    public void crearLavadora() {

        crearElectrodomestico();

        System.out.println("Ingrese la capacidad de carga:");
        System.out.print(">>");
        this.carga = read.nextInt();

        /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
         */
        precioFinal();
        if (carga > 30) {
            precio += 500;
        }
    }

    public void mostrarLav() {
        System.out.println("Datos de la lavadora:");
        System.out.println("Carga = " + getCarga());
        System.out.println("Tipo de consumo = " + getClasifEnerg());
        System.out.println("Color = " + getColor());
        System.out.println("Peso = " + getPeso());
        System.out.println("Precio = " + getPrecio());

    }

    public void crearLavadora(int i, double d, String negro, String a, int i0) {
        //crearElectrodomestico();
        
        carga=i;
        precio=d;
        color=negro;
        clasifEnerg=a;
        peso=i0;
        
        precioFinal();
        if (carga > 30) {
            precio += 500;
        }
    }

    
   

}
