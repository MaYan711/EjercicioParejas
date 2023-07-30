/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Arrays;
import java.util.Collections;/**
 *
 * @author LL829
 */


public class carta {
    private char symbol;
    private char type;


public void setSymbol(char s){
this.symbol = s;
}
public void setType(char t){
    this.type = t;
    
    public char getSymbol(){ return this.symbol;}
    
    public char getType() { return this.type;}
    
    public int getValue() {
    if(this.symbol=='J') return 11;
    else if (this.symbol=='Q') return 12;
    else if (this.symbol=='K') return 13;
    else if (this.symbol=='X') return 1;
    else return Integer.parseInt(this.symbol + "");
    }
    public String toString(){
        return this.symbol + "" + this.type;
    }
            
}

