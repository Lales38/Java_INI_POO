package guia_10_main;

import guia_10_Object.Pelicula;
import guia_10_Service.PeliculaServicio;
import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class G10_e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio pel = new PeliculaServicio();
        ArrayList<Pelicula> ListadoPelis = new ArrayList<>();

        pel.cargarPelicula(ListadoPelis);

        pel.mostrarListaPelis(ListadoPelis);

        pel.mostrarPelisculasLargas(ListadoPelis);

        pel.mostrarDesendenteDuracion(ListadoPelis);

        pel.mostrarPelisAscendente(ListadoPelis);

        pel.mostrarPorTitulo(ListadoPelis);

        pel.mostrarPorDirector(ListadoPelis);

    }

}
