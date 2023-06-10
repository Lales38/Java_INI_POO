package guia_12_e2.Entidad;

import java.util.Scanner;

/**
 * @author Alejandro Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color, consumo energético (letras entre A y F) y peso. Los constructores que se deben implementar son los siguientes: • Un constructor vacío. • Un constructor con todos los atributos pasados por parámetro. Los métodos a implementar son: • Métodos getters y setters de todos los atributos.
 */
public class Electrodomestico {

    protected Double precio;
    protected String color;
    protected String clasifEnerg;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, String clasifEnerg, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.clasifEnerg = clasifEnerg;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getClasifEnerg() {
        return clasifEnerg;
    }

    public void setClasifEnerg(String clasifEnerg) {
        this.clasifEnerg = clasifEnerg;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", clasifEnerg=" + clasifEnerg + ", peso=" + peso + '}';
    }
    

    /*
    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
     */
    public String comprobarConsumo(String letra) {
        switch (letra) {
            case "A":
                break;
            case "B":
                break;
            case "C":
                break;
            case "D":
                break;
            case "E":
                break;
            default:
                letra = "F";
        }
        return letra;

    }

    /*
    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    public String comprobarColor(String color) {
        switch (color) {
            case "blanco":
                break;
            case "negro":
                break;
            case "rojo":
                break;
            case "azul":
                break;
            case "gris":
                break;
            default:
                color = "blanco";
        }
        return color;
    }

    /*
    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
     */
    public void crearElectrodomestico() {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
       
        this.precio = 1000d;

        System.out.println("Ingrese el color deseado");
        System.out.print(">>");
        this.color = comprobarColor(read.next().toLowerCase());

        System.out.println("Ingrese la clasificación energética");
        System.out.print(">>");
        this.clasifEnerg = comprobarConsumo(read.next().toUpperCase());

        System.out.println("Ingrese el peso del artefacto");
        System.out.print(">>");
        this.peso = read.nextInt();
    }

    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
     */
    public void precioFinal() {
        
        switch (clasifEnerg) {
            case "A":
                precio += 1000;
                break;
            case "B":
                precio += 800;
                break;
            case "C":
                precio += 600;
                break;
            case "D":
                precio += 500;
                break;
            case "E":
                precio += 300;
                break;
                
        }
       
        if (peso > 0 && peso < 20) {
            precio += 100;
            

        } else if (peso > 19 && peso < 50) {
            precio += 500;
        } else if (peso > 49 && peso < 80) {
            precio += 800;
        } else if (peso > 80) {
            precio += 1000;
        }
        
    }
}
