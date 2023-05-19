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
public class Operacion {

    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double creaOperacion(double n1, double n2) {
        numero1 = n1;
        numero2 = n2;
        return 0;
    }

    public double sumar() {
        double suma = numero1 + numero2;
        return suma;

    }

    public double restar() {
        double resta = numero1 - numero2;
        return resta;

    }

    public double multi() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Uno de los numeros es igual a cero, resultado 0");
             return 0;
        } else {
            double prod = numero1 * numero2;
            return prod;
        }
       

    }

    public double dividir() {
        if (numero2 == 0) {
            System.out.println("El divisor es 0, no existe solución");
            return 0;
        } else {
            double div = numero1 / numero2;
            return div;
        }
        

    }
}
