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
public class Rectangulo {

    private double altura;
    private double base;

    public Rectangulo() {
    }

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void creaRectangulo(double alt, double b) {
        altura = alt;
        base = b;

    }

    public double area() {
        double sup = base * altura;
        return sup;
    }

    public double perimetro() {
        double peri = (base + altura) * 2;
        return peri;
    }

    public double dibu() {
        double a = altura;
        double b = base;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == 0 || i == (a-1)) {
                    System.out.print("*");
                }else{
                    if (j==0||j==(b-1)) {
                      System.out.print("*");  
                    }else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("");
        }
        return 0;
    }

}
