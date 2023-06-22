package Service;

import Entidad.Alquiler;
import com.github.javafaker.Faker;//para crear nombres fantasias
import entidad.Barco;
import entidad.Embarcacion;
import entidad.Velero;
import entidad.Yate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

/**
 * @author Alejandro
 */
public class AlquilerService {

    private Faker f = new Faker();
    private ArrayList<Embarcacion> listaBarcos = new ArrayList<>();
    private Alquiler cliente;
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void crearBarco() {

        Velero vel1 = new Velero((int) (Math.random() * 10 + 5), "22-BA-78", (int) (Math.random() * 50 + 10), 2000);
        Velero vel2 = new Velero((int) (Math.random() * 10 + 5), "22-CB-99", (int) (Math.random() * 50 + 10), 1996);
        Yate ya1 = new Yate((int) (Math.random() * 10 + 1), (int) (Math.random() * 100 + 30), "44-GH-62", (int) (Math.random() * 30), 2013);
        Yate ya2 = new Yate((int) (Math.random() * 10 + 1), (int) (Math.random() * 100 + 30), "74-BV-60", (int) (Math.random() * 30), 2020);
        Barco bar1 = new Barco((int) (Math.random() * 100 + 30), "11-JK-55", (int) (Math.random() * 50 + 10), 2001);
        Barco bar2 = new Barco((int) (Math.random() * 100 + 30), "71-MN-35", (int) (Math.random() * 50 + 10), 2008);

        listaBarcos.add(vel1);
        listaBarcos.add(vel2);
        listaBarcos.add(ya1);
        listaBarcos.add(ya2);
        listaBarcos.add(bar1);
        listaBarcos.add(bar2);
    }

    public ArrayList<Embarcacion> getListaBarcos() {
        return listaBarcos;
    }

    public void setListaBarcos(ArrayList<Embarcacion> listaBarcos) {
        this.listaBarcos = listaBarcos;
    }

    public void crearCliente() {
        System.out.println("Ingrese los dias de alquiler:");
        int dias = read.nextInt();

        Date ini = new Date();
        Date fin = new Date();
        ini.getDate();
        fin.setDate(ini.getDate() + dias);

        System.out.println(fin.getDate());
        System.out.println(ini.getDate());

        System.out.println("Elija una embarcación: ");

        int cont = 0;
        for (Embarcacion aux : listaBarcos) {
            System.out.println("Opción :" + cont + " - " + aux.toString());
            cont++;
        }
        System.out.println("====================================");

        int posi = read.nextInt();

        cliente = new Alquiler(f.name().firstName(), 26066923, ini, fin, posi, listaBarcos.get(posi).toString());
    }

    public void calcularAlquiler() {

        int dias = ((cliente.getFin().getDate()) - (cliente.getIni().getDate()));

        Integer Alquiler = 0;// =dias*eslora*10(base)

        Alquiler = (dias * listaBarcos.get(cliente.getPosicion()).getEslora() * 10);

        System.out.println(listaBarcos.get(cliente.getPosicion()));

        if (listaBarcos.get(cliente.getPosicion()) instanceof Yate) {
            Yate y = (Yate) listaBarcos.get(cliente.getPosicion());
            Alquiler = (Alquiler + y.getCv() + y.getCamarote());
        } else if (listaBarcos.get(cliente.getPosicion()) instanceof Barco) {
            Barco b = (Barco) listaBarcos.get(cliente.getPosicion());
            Alquiler = Alquiler + b.getCv();
        } else if (listaBarcos.get(cliente.getPosicion()) instanceof Velero) {
            Velero v = (Velero) listaBarcos.get(cliente.getPosicion());
            Alquiler = Alquiler + v.getMastiles();
        }

        System.out.println("El costo total del alquiler es: $" + Alquiler);

    }

}
