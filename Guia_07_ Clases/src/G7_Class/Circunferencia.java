/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7_Class;

/**
 *
 * @author Alejandro
 */
public class Circunferencia {

    private double radio;
    private double circunferencia;
    private double area;
    private double perimetro;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double circunf() {
        circunferencia = radio * 3.14159;
        return circunferencia;

    }

    public double area() {
        area = (radio * 3.14159) * (radio * 3.14159);
        return area;
    }

    public double perimetro() {

        perimetro = 2 * 3.14159 * radio;
        return perimetro;

    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", circunferencia=" + circunferencia + ", area=" + area + ", perimetro=" + perimetro + '}';
    }

}
