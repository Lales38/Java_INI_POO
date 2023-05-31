package guia_11.Main;

import Entity.Juego;
import Entity.Players;
import Entity.WaterGun;
import java.util.ArrayList;

/**
  * @author Alejandro
 */
public class G11_2 {
    
    public static void main(String[] args) {
        ArrayList<Players> players = new ArrayList<>();
        int cont=0;
        WaterGun gun = new WaterGun();
        
        Players p1 = new Players("Juliana", false);
        Players p2 = new Players("Alberto", false);
        Players p3 = new Players("Rodrigo", false);
        Players p4 = new Players("Aldana", false);
        Players p5 = new Players("Bruno", false);
        Players p6 = new Players("Roberto", false);
        
           players.add(p1); 
           players.add(p2);
           players.add(p3);
           players.add(p4);
           players.add(p5);
           players.add(p6);
           
           Juego game = new Juego(players, gun);
        game.ronda();
        
    }

}
