package Entidad;

/**
 * @author Alejandro
 */
public class DivisionNumero {

    private int a;
    private int b;

    public DivisionNumero(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public DivisionNumero() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void parSeInt(String a, String b) {//tipo umberFormatException no se puede convertir en int
        try {
            this.a = Integer.parseInt(a);
            this.b = Integer.parseInt(b);
        } catch (NumberFormatException e) {
            System.out.println("El o los datos ingresados son incorrectos no se pueden convertir en enteros!!!");
        }

    }

    public void dividir() {
        try {
            System.out.println("El resultado de la división de los números ingresados es :" + (this.a / this.b));
        } catch (ArithmeticException e) {
            System.out.println("La división entre los números ingresados no es posible ");
        }

    }

}
