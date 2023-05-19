
package G7EjeExtraClass;

import java.util.Scanner;

/**
 *
 * @author Alejandro
 */
public class Ex2_Puntos {

    Scanner read = new Scanner(System.in);

    public int x1;
    public int y1;
    public int x2;
    public int y2;

    public Ex2_Puntos() {
    }

    public Ex2_Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void creaPuntos() {

        System.out.println("Ingrese el Valor X1: ");
        this.x1 = read.nextInt();
        System.out.println("Ingrese el Valor Y1: ");
        this.y1 = read.nextInt();
        System.out.println("Ingrese el Valor X2: ");
        this.x2 = read.nextInt();
        System.out.println("Ingrese el Valor Y2: ");
        this.y2 = read.nextInt();

    }

    public void distancia() {

        double dis = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("La distancia entre los puntos es: " + dis);
    }

}
