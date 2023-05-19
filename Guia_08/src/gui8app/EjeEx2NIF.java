package gui8app;

import guia8app.Entidades.NIF;
import guia8app.Servicios.NIFService;

/**
 * @author Alejandro
 */
public class EjeEx2NIF {

    public static void main(String[] args) {

        NIFService ns = new NIFService();
        NIF nf = ns.creaNIF();
        ns.mostrar(nf.getDni(), nf.getLetra());

    }

}
