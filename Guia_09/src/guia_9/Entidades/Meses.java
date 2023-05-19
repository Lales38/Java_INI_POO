package guia_9.Entidades;

import java.util.Scanner;

/**
 * @author Alejandro
 *
 *
 *
 */
public class Meses {

    Scanner read = new Scanner(System.in);

    private String[] meses = new String[12];
    private String mesSecreto ;

    public Meses() {
        this.meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        this.mesSecreto= meses[9];
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public void mesSecreto() {
        boolean ban = false;
        do {
            System.out.println("Ingrese un mes: ");
            System.out.print(">>");            
            String mesTeclado=read.nextLine().toLowerCase();
            
            if (mesTeclado.equals(mesSecreto) ){
                System.out.println(" Adivinaste el mes secreto!!!!!");
                ban= true;
            } else {
                System.out.println("Seguí intentando.");
            }

        } while (!ban);

    }

}
