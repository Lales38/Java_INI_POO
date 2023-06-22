package Entidades;

import java.util.Scanner;

/**
  * @author Alejandro
 */
public class Rectangulo implements CalculosFormas{
    Scanner read = new Scanner(System.in).useDelimiter("\n");
   
    private double alto;
    private double base;

    public Rectangulo() {
    }

    public Rectangulo(double alto, double base) {
        this.alto = alto;
        this.base = base;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    

    @Override
    public void calcularArea() {
        System.out.println("Ingrese el alto del rectángulo: ");
        System.out.print(">>");
        alto=read.nextDouble();
        
        System.out.println("Ingrese la longitud de la base: ");
        System.out.print(">>");
        base=read.nextDouble();
        
        System.out.println("El área del rectangulo es: "+ (alto * base));
    
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del rectángulo es : " + ((alto+base)*2));

    }
    
    
                

}
