package guia_12_e2.Entidad;

import java.util.Scanner;

/**
 * @author Alejandro Se debe crear también una subclase llamada Televisor con los siguientes atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
 */
public class Televisor extends Electrodomestico {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    Double resolucion;
    Boolean tdt = false;

    public Televisor() {
    }

    public Televisor(Double resolucion, Boolean tdt, Double precio, String color, String clasifEnerg, Integer peso) {
        super(precio, color, clasifEnerg, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getTdt() {
        return tdt;
    }

    public void setTdt(Boolean tdt) {
        this.tdt = tdt;
    }

    /*
    Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
     */
    public void crearTelevisor() {

        crearElectrodomestico();

        System.out.println("Ingrese la cantidad de pulgadas:");
        System.out.print(">>");
        this.resolucion = read.nextDouble();

        System.out.println("Tiene TDT?? (s/n)");
        System.out.print(">>");
        String a = read.next().toLowerCase();
        if ("s".equals(a)) {
            tdt = true;
        }
        /*
        Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
        */
         precioFinal();
         if (resolucion>40) {
           precio = precio*1.30; 
        }if (tdt) {
           precio+= 500; 
        }
         
    }

    public void mostrarTele() {
        System.out.println("Datos del Televisor:");
        System.out.println("Pulgadas = " + getResolucion());
        System.out.println("Tipo de consumo = " + getClasifEnerg());
        System.out.println("Color = " + getColor());
        System.out.println("Peso = " + getPeso());
        System.out.println("Precio = " + getPrecio());
        if (tdt) {
            System.out.println("Tiene TDT");
        }else{
            System.out.println("NO tiene TDT");
        }
        

    }

    public void crearTelevisor(double d, boolean b, double d0, String negro, String a, int i) {
       //crearElectrodomestico();
       resolucion=d;
       tdt=b;
       precio=d;
        color=negro;
        clasifEnerg=a;
        peso=i;
        
        precioFinal();
         if (resolucion>40) {
           precio = precio*1.30; 
        }if (tdt) {
           precio+= 500; 
        }
       
    }

}
