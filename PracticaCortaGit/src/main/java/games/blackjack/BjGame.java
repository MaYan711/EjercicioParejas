/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.blackjack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import player.Player;

import utils.ConsoleData;
import utils.TextArt;

/**
 *
 * @author LL829
 */
public class BjGame {

    /**
     * @param args the command line arguments
     */
    public BjGame(Player player) throws IOException {

        Deck d = new Deck();

        d.createcarta();
        mano handComputer = new mano();
        mano handHuman = new mano();
        handComputer.addcarta(d.getcarta());
        handComputer.addcarta(d.getcarta());
        handHuman.addcarta(d.getcarta());
        handHuman.addcarta(d.getcarta());

        while (handComputer.getValue() <= 16) {
            handComputer.addcarta(d.getcarta());
        }

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Tus cartas: " + handHuman.toString());
        System.out.println(" ");
        System.out.println("Cuanto dinero tiene?: "); // + dine.toString());
        System.out.println("Cada entrada cuesta $25");

        // ConsoleData.getString("Que desea hacer? quedarse[q] o plantarse[p]");
        System.out.println("Que desea hacer? quedarse[q] o plantarse [p]");
        String teclado = "";

        while ((teclado = br.readLine()) != null) {
            if (teclado.equalsIgnoreCase("q")) {
                handHuman.addcarta(d.getcarta());
                // System.out.println("Tu dinero : " + dine.toString());
                System.out.println("Tus cartas: " + handHuman.toString());
            } else
                break;
        }

        System.out.println("La casa gana: " + handComputer.toString());
        System.out.println("Tiene todavia: " + handHuman.toString());

        ConsoleData.waitKey(TextArt.BG_RED + " --> Pulse una tecla para continuar <--" + TextArt.RESET);

    }


}