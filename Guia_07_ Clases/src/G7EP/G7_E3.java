/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7EP;

import G7_Class.Operacion;
import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class G7_E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Operacion op1 = new Operacion();

        op1.creaOperacion(read.nextDouble(), read.nextDouble());

        //op1.sumar();
        System.out.println("La suma de los números es: " + op1.sumar());

        System.out.println("La resta de los números es: " + op1.restar());
        
        System.out.println("La multiplicación de los números es: " + op1.multi());
        
        System.out.println("La división de los números es: " + op1.dividir());
    }

}
