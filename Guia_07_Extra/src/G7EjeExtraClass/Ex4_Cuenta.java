/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
después de realizar una transacción de retiro.
 */
package G7EjeExtraClass;

/**
 *
 * @author Alejandro
 */
public class Ex4_Cuenta {
    
    private double saldo;
    private String titular;

    public Ex4_Cuenta() {
    }

    public Ex4_Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirar_dinero(double retiro){
        
        if (retiro<saldo) {
            saldo-=retiro;
            System.out.println("Su saldo es de " + saldo);
        }else{
            System.out.println("Su saldo es insuficiente para el monto ingresado.");
        }
        
    }
    
    
}
