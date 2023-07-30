/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPkg;

import org.w3c.dom.Text;

import utils.*;

/**
 *
 * @author sirbon
 */
public class mainGame {

    public static void main(String[] args) {

        mainGame newGame = new mainGame();
    }

    public mainGame() {
        mainMenu();
    }

    private void mainMenu() {

        boolean exit = false;

        do {
            TextArt.showTittle();
            TextArt.showMenuTittle();
            System.out.println("\n\n1. Jugar ahorcado");
            System.out.println("2. Jugar baloncesto");
            System.out.println("3. Jugar cartas");
            System.out.println("4. Ver instrucciones");
            System.out.println("0. Salir");

            switch (ConsoleData.getInt("Ingrese la opcion seleccionada: ", false)) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;

            default:
                TextArt.showErrorMsg();
                ConsoleData.waitKey(TextArt.BG_RED + " --> Pulse una tecla para continuar <--" +TextArt.RESET);
            }

        } while (exit == false);

    }

}
