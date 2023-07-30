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
    
    private String nombre;
    private int edad;
    private int punteo;

//---------- constructors ---------- \\ 
    public Player() {
    }

    public Player(String nombre, int edad, int punteo) {
        this.nombre = nombre;
        this.edad = edad;
        this.punteo = punteo;
    }

    public Player(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Player(String nombre) {
        this.nombre = nombre;
    }
//---------- end of constructors ----------\\
    
    
    //---------- getters & setters ----------\\
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPunteo() {
        return punteo;
    }

    public void setPunteo(int punteo) {
        this.punteo = punteo;
    }
    
    
    
}
