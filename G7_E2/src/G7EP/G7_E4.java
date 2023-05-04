/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7EP;


import G7_Class.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class G7_E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Rectangulo R1 = new Rectangulo();
        System.out.println("Ingrese las medidas del rectángulo: ");

        R1.creaRectangulo(read.nextDouble(), read.nextDouble());

        System.out.println("El área el rectágulo es: " + R1.area());
        System.out.println("El perímetro del rectángulo es: " + R1.perimetro());

        R1.dibu();
    }

}
