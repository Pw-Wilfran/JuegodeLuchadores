/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_mortalkumbia;

/**
 *
 * @author wilfr
 */
public abstract class Peleador {
    
    protected String nombre;
    protected int HP;
    protected int ATK;

    public Peleador(String nombre, int HP, int ATK) {
        this.nombre = nombre;
        this.HP = HP;
        this.ATK = ATK;
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public boolean estaVivo() { 
        return HP > 0; 
    }

    public void recibirDanio(int danio) {
        if(this.HP < danio){
            this.HP = 0;
        } else {
            this.HP -= danio;
        }
        System.out.println(this.nombre + " recibe " + danio + " de daño. PH restante: " + this.HP); 
     }

    public void mostrar() {
        System.out.println("PH: " + HP);
        System.out.println("ATK: " + ATK);
    }

    public abstract void mostrarHabilidades();
    public abstract void atacar(Peleador objetivo);
    public abstract void atacarManual(Peleador objetivo, int opcion);
}
