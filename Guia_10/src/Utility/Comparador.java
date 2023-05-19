package Utility;

import guia_10_Object.Countries;
import guia_10_Object.Pelicula;
import java.util.Comparator;

/**
 * @author Alejandro
 */
public class Comparador {

    public static Comparator<Pelicula> ordenDescDura = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return Integer.compare(t1.getDuracion(), t.getDuracion());
        }
    };

    public static Comparator<Pelicula> ordenAscDura = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    public static Comparator<Pelicula> NomAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    public static Comparator<Pelicula> diectorAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
     public static Comparator<Countries> orderCountry = new Comparator<Countries>() {
        @Override
        public int compare(Countries t, Countries t1) {
            return t.getCountry().compareTo(t1.getCountry());
        }
     
       
    };
    
    
}
