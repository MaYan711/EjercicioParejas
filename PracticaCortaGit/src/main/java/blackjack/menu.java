/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import blackjack.mano;
import blackjack.mazo;
import java.io.*;

/**
 *
 * @author LL829
 */
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Deck d = new Deck();
        d.createcartas();
        dinero dine = new dine();
        mano handComputer = new mano();
        mano handHuman = new mano();
        handComputer.addCard(d.getcarta());
        handComputer.addCard(d.getcarta());
        handHuman.addCard(d.getcarta());
        handHuman.addCard(d.getcarta());
        
        while (handComputer.getValue () <=16){
            handComputer.addCard(d.getcarta());
            
        }
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Cuanto dinero tiene?: " + dine.toString());
        System.out.println("Tus cartas: " + handHuman.toString());
        System.out.println("Que desea hacer? quedarse[q] o plantarse [p]");
        String teclado ="";
        while ((teclado = br.readLine()) != null){
            if (teclado.equalsIgnoreCase("q")){
                handHuman.addCard(d.getcarta());
                System.out.println("Tu dinero : " + dine.toString());
                System.out.println("Tus cartas: " + handHuman.toString());
            }
            else
                break;
        }
        System.out.println("La casa: " + handComputer.toString());
        // TODO code application logic here
    }
    
}
