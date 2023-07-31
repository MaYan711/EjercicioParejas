/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.blackjack;

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
    public BjGame() {
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

        // System.out.println("Cuanto dinero tiene?: " + dine.toString());
        System.out.println("Tus cartas: " + handHuman.toString());
        String teclado = ConsoleData.getString("Que desea hacer? quedarse[q] o plantarse [p]");
        while ((teclado) != null) {
            if (teclado.equalsIgnoreCase("q")) {
                handHuman.addcarta(d.getcarta());
                // System.out.println("Tu dinero : " + dine.toString());
                System.out.println("Tus cartas: " + handHuman.toString());
                break;
            }
        }
        System.out.println("La casa: " + handComputer.toString());
        ConsoleData.waitKey(TextArt.BG_RED + " --> Pulse una tecla para continuar <--" + TextArt.RESET);

    }

}