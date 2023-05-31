package Entity;

/**
 * @author Alejandro 
 * Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del jugador),
 * nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica si está mojado o no el jugador).
 * El número de jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
 * 
 */
public class Players {

    private int id;
    private String name;
    private boolean mojado;

    public void Player(String name, boolean mojado) {

        this.id = (int) (Math.random() * 1000);

        this.name = name;

        this.mojado = mojado;

    }

    /*
    el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver.
 El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja.
 El atributo mojado pasa a true y el método
devuelve true, sino false.
    
     */
    public boolean disparo(WaterGun r) {

        boolean aux = false;

        if (r.mojar()) {

            aux = this.mojado = true;

            r.nextShoot();

        } else {

            aux = this.mojado = false;

            r.nextShoot();

        }
        return aux;

    }

    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public boolean isMojado() {

        return mojado;

    }

    public void setMojado(boolean mojado) {

        this.mojado = mojado;

    }

    @Override
    public String toString() {

        return "[" + "nombre de Jugador " + name + "ID: " + id + ", mojado=" + mojado + "]";
    }

    public Players(String name, boolean mojado) {
        this.name = name;
        this.mojado = mojado;
    }

  

}


