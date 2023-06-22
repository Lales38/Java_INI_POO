package Entidades;

import java.util.Scanner;

/**
  * @author Alejandro
 */
public class Circulo implements CalculosFormas{
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    
    @Override
    public void calcularArea() {
        System.out.println("Ingrese el ridio del circulo:");
        System.out.print(">>");
        radio=read.nextDouble();
        System.out.println("El area del circulo es : "+(pi*radio*radio));
        
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("El perímetro del circulo es "+(radio*2*pi));
    
    }

}
