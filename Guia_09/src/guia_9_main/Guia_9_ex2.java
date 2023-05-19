/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_9_main;

import guia_9.Servicios.AhorcadoService;
import guia_9.Entidades.Ahorcado;

/**
 *
 * @author Alejandro
 */
public class Guia_9_ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AhorcadoService as = new AhorcadoService();
        
        Ahorcado Juego = as.crearJuego();
        
        as.ajugar(Juego);
    
}
}
