/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7EP;

import G7_Class.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class G7_E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Circunferencia c1 = new Circunferencia(read.nextDouble());

        c1.circunf();

        c1.area();

        c1.perimetro();

        System.out.println(c1.toString());

    }

}
