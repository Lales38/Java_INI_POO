package Entity;

import java.util.ArrayList;

/**
 * @author Alejandro
 */
public class Juego {

    private ArrayList<Players> players;

    private WaterGun revolver;

    public Juego(ArrayList<Players> players, WaterGun revolver) {
        this.players = players;
        this.revolver = revolver;
    }

    public Juego() {
    }

    /*
    este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
     */
    public void llenarJuego(ArrayList<Players> p, WaterGun r) {
        this.players = p;
        this.revolver = r;
    }

    /*
    cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
     */
    public void ronda() {
        int randomIndex;
        Players anyPlayer;
        int cont = 1;

        do {
            System.out.println("Ronda " + (cont++));

            randomIndex = (int) (Math.random() * this.players.size());
            anyPlayer = this.players.get(randomIndex);

            anyPlayer.disparo(this.revolver);

            if (anyPlayer.isMojado()) {
                System.out.println("Jugador " + anyPlayer + " resulto mojado");
                System.out.println("Game over");

            } else {
                System.out.println("Ningun jugador resulto mojado. El juego continua");
                System.out.println("Jugador seleccionado " + anyPlayer);
                System.out.println("Posicion A " + this.revolver.getPosActual()+ " Posicion B " + this.revolver.getPosAgua());
            }

        } while (!anyPlayer.isMojado());

    }

    public ArrayList<Players> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Players> players) {
        this.players = players;
    }

    public WaterGun getRevolver() {
        return revolver;
    }

    public void setRevolver(WaterGun revolver) {
        this.revolver = revolver;
    }

}


