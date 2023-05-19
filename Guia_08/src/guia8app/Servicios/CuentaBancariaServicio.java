package guia8app.Servicios;

import guia8app.Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 * @author Alejandro
 */
public class CuentaBancariaServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    //Metodo para crear cuenta pidiéndole los datos al usuario.
    public CuentaBancaria crea_Cuenta() {
        CuentaBancaria c1 = new CuentaBancaria();

        System.out.println("Ingrese el número de cuenta:");
        System.out.print(">>");
        c1.setNumCuenta(read.nextInt());

        System.out.println("Ingrese el DNI :");
        System.out.print(">>");
        c1.setDniCliente(read.nextLong());

        System.out.println("Ingrese su saldo :");
        System.out.print(">>");
        c1.setSaldoActual(read.nextDouble());

        return c1;
    }

    // Metodo para ingresar dinero
    public void ingresar(CuentaBancaria c1) {
        System.out.println("Ingres el dinero a depositar: ");
        double in = read.nextDouble();
        c1.setSaldoActual(c1.getSaldoActual() + in);
        System.out.println("el saldo es de : " + c1.getSaldoActual());

    }

    public void retirar(CuentaBancaria c1) {
        System.out.println("Ingrese la cantidad de dinero a retirar: ");
        double ret = read.nextDouble();

        if (c1.getSaldoActual() < ret) {
            System.out.println("Su saldo es insuficiente ");
            c1.setSaldoActual(0);
            System.out.println("Su saldo actual es: " + c1.getSaldoActual());
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - ret);

            System.out.println("Su saldo actual es: " + c1.getSaldoActual());

        }

    }

    public void extraRapida(CuentaBancaria c1) {
        System.out.println("Retiro rápido menor al 20%:");
        double rap = c1.getSaldoActual() * 0.2;
        c1.setSaldoActual(c1.getSaldoActual() - rap);
        System.out.println("Retiro: " + rap);
        System.out.println("Su saldo actual es : " + c1.getSaldoActual());
    }

    public void consulta(CuentaBancaria c1) {

        System.out.println("El saldo disponible es : " + c1.getSaldoActual());

    }

    public void cons_datos(CuentaBancaria c1) {
        System.out.println("El saldo disponible es : " + c1.getDniCliente());
        System.out.println("El saldo disponible es : " + c1.getNumCuenta());

    }

}
