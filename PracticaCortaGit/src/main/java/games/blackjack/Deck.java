/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.blackjack;


import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author LL829
 */
public class Deck {
    carta cartas [] = new carta[52];
    int position;
    
    public void createCards(){
        String symbols = "123456789JQKA";
        String types = "SCDH";
        int index =0;
        
        for (int i=0; i < types.length(); i++){
            for (int j=0; j < symbols.length(); j++){
            carta tempcarta = new carta();
            tempcarta.setSymbol(symbols.charAt(j));
            tempcarta.setType(types.charAt(i));
            this.cartas[index] = tempcarta;
            index++;
            
        }
        }
        shufflecartas();
        
    }
    private void shufflecartas(){
        Collections.shuffle(Arrays.asList(this.cartas));
        
    }
    public carta getcarta(){
        if (position ==51){
            System.out.println("Se acabaron las cartas");
            return null;
        }
        carta tempcarta = this.cartas[position];
        position++;
        return tempcarta;
    }
}
