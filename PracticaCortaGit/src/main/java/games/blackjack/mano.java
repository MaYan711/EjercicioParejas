/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games.blackjack;

import java.util.ArrayList;

/**
 *
 * @author LL829
 */
public class mano {
    ArrayList<carta> arr = new ArrayList<carta>();
    int positin = 0;
    
    public void addcarta(carta c){
        arr.add(c);
    }
    
    public String toString(){
        String mano ="";
        for (int i=0; i <arr.size(); i++)
        mano += arr.get(i).toString() + "";
        return mano;
    }
    public int getValue(){
        int val = 0;
        boolean ace= false;
        for (int i=0; i <arr.size(); i++){
        carta tmpcarta = arr.get(i);
        int cartaValue = tmpcarta.getValue();
        if (cartaValue>10)
            cartaValue=10;
        if (cartaValue==1)
            ace = true;
        val += cartaValue;
        
    }
        if (ace ==true && val +10 <=21)
            val = val +10;
        return val;
    }
}