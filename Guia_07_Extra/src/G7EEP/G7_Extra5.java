/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado
en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado
tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package G7EEP;

import G7EjeExtraClass.Ex5_Empleado;

/**
 *
 * @author Alejandro
 */
public class G7_Extra5 {

    public static void main(String[] args) {
        Ex5_Empleado E1 = new Ex5_Empleado();

        E1.setNombre("Ale S");
        E1.setEdad(29);
        E1.setSalario(10000);

        E1.aumento_salario();

        E1.setSalario(10000);
        E1.setEdad(33);

        E1.aumento_salario();
    }
}
