/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author sirbon
 */
public class Player {
    
    private String name;
    private int age;
    private int points;
    private double dinero;

    //---------- constructors ---------- \\ 
    public Player() {
    }

    public Player(String name, int age, int points) {
        this.name = name;
        this.age = age;
        this.points = points;
    }

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    

    public Player(String name) {
        this.name = name;
    }
    
    
    public int getDinero(){
        return (int) dinero;
    }
    
    public void setDinero(){
        this.dinero = dinero;
    }
    //---------- end of constructors ----------\\
    
    
    //---------- getters & setters ----------\\

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return int return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return int return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(int points) {
        this.points = points;
    }

}

