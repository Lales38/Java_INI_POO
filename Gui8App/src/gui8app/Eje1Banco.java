package gui8app;

import guia8app.Entidades.CuentaBancaria;
import guia8app.Servicios.CuentaBancariaServicio;



/**
 * @author Alejandro
 */
public class Eje1Banco {

    public static void main(String[] args) {
       CuentaBancariaServicio cbs=new CuentaBancariaServicio();
       CuentaBancaria cu2= cbs.crea_Cuenta();
       //cbs.crea_Cuenta();
       
        System.out.println("El número de cuenta es: "+ cu2.getNumCuenta());
        System.out.println("El número de DNI es: "+ cu2.getDniCliente());
        System.out.println("El saldo de la cuenta es: "+ cu2.getSaldoActual());
       
        cbs.ingresar(cu2);
        cbs.retirar(cu2);
        cbs.extraRapida(cu2);
        cbs.consulta(cu2);
        cbs.consulta(cu2);
        
    } 
}
