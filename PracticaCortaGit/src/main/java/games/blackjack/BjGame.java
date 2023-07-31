/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.blackjack;

import utils.ConsoleData;

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
        d.createCards();
        mano handComputer = new mano();
        mano handHuman = new mano();
        handComputer.addCard(d.getcarta());
        handComputer.addCard(d.getcarta());
        handHuman.addCard(d.getcarta());
        handHuman.addCard(d.getcarta());

        while (handComputer.getValue() <= 16) {
            handComputer.addCard(d.getcarta());
        }

        // System.out.println("Cuanto dinero tiene?: " + dine.toString());
        System.out.println("Tus cartas: " + handHuman.toString());
        String teclado = ConsoleData.getString("Que desea hacer? quedarse[q] o plantarse [p]");
        while ((teclado) != null) {
            if (teclado.equalsIgnoreCase("q")) {
                handHuman.addCard(d.getcarta());
                // System.out.println("Tu dinero : " + dine.toString());
                System.out.println("Tus cartas: " + handHuman.toString());
            } else
                break;
        }
        System.out.println("La casa: " + handComputer.toString());
    }

}