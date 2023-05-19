package guia_10_Service;

import Utility.Comparador;
import guia_10_Object.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Alejandro En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula. Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
 */
public class PeliculaServicio {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

   // ArrayList<Pelicula> ListadoPelis = new ArrayList(); 
 
        
        
    

    public void cargarPelicula(ArrayList<Pelicula> ListadoPelis) {
        String resp;
        do {
            Pelicula peli = new Pelicula();

            System.out.println("Ingrese el nombre de la pelicula: ");
            //System.out.print(">>");
            peli.setTitulo(read.next());

            System.out.println("Ingrese el director: ");
            //System.out.print(">>");
            peli.setDirector(read.next());

            System.out.println("Ingrese la duracion de la pelicula:");

            System.out.println("Cantidad de horas: ");
            int hh = read.nextInt();

            System.out.println("Cantidad de minutos: ");
            int mm = read.nextInt();

            int dur = hh * 60 + mm;

            peli.setDuracion(dur);

            ListadoPelis.add(peli);

            System.out.println("-------------------");
            System.out.println("Desea ingresar una pelicula mas? ");
            //System.out.print(">>");
            resp = read.next().toLowerCase();

            //String a = read.next();
        } while (!"n".equals(resp));

    }

    // Mostrar en pantalla todas las películas    
    public void mostrarListaPelis(ArrayList<Pelicula> ListadoPelis){
        System.out.println("----------Listado de peliculas:--------");
        for (Pelicula aux : ListadoPelis) {
            System.out.print("Título: " + aux.getTitulo());
            System.out.print(", Director :" + aux.getDirector());
            System.out.print(", duración: " + aux.getDuracion() + "minutos");
            System.out.println(" ");
        }
        System.out.println("----------------------------------------");
    }

    //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarPelisculasLargas(ArrayList<Pelicula> ListadoPelis) {
        System.out.println("----Estas peliculas duran mas de 1 hora---");
        ListadoPelis.stream().filter((pelicula) -> (pelicula.getDuracion() > 60)).forEachOrdered((pelicula) -> {
            System.out.println("Nombre Pelicula: " + pelicula);
        });

    }

    //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    public void mostrarDesendenteDuracion(ArrayList<Pelicula> ListadoPelis) {
        //ArrayList<Pelicula> film = new ArrayList<>();
        System.out.println("--------Listado duración de mayor a menor------");
        Collections.sort(ListadoPelis, Comparador.ordenDescDura);
        for (Pelicula aux : ListadoPelis) {
            System.out.println("pelicula = " + aux.toString());           
            
        }
    }

    //Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en antalla.       
    public void mostrarPelisAscendente(ArrayList<Pelicula> ListadoPelis) {
        
        System.out.println("--------Listado duración de menor a mayor------");
        Collections.sort(ListadoPelis, Comparador.ordenAscDura);
        for (Pelicula aux : ListadoPelis) {
            System.out.println("pelicula = " + aux.toString());
        }

    }

    //Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void mostrarPorTitulo(ArrayList<Pelicula> ListadoPelis) {
        
        System.out.println("--------Listado Ordenado alfabéticamente------");
        Collections.sort(ListadoPelis, Comparador.NomAlfabeticamente);
            for (Pelicula aux : ListadoPelis) {
                System.out.println("pelicula = " + aux.toString());
        }
    }

    //Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.           
    public void mostrarPorDirector(ArrayList<Pelicula> ListadoPelis) {
        
        System.out.println("--------Listado alfabéticamente por director------");
        Collections.sort(ListadoPelis, Comparador.diectorAlfabeticamente);
        for (Pelicula aux : ListadoPelis) {
                System.out.println("pelicula = " + aux.toString());
        }
        
    }

    
       
}