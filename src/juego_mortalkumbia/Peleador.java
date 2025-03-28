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
    protected int PH;
    protected int ATK;

    public Peleador(String nombre, int PH, int ATK) {
        this.nombre = nombre;
        this.PH = PH;
        this.ATK = ATK;
    }

    public String getNombre() { 
        return nombre; 
    }
    
    public boolean estaVivo() { 
        return PH > 0; 
    }

    public void recibirDanio(int danio) {
        this.PH -= danio;
        System.out.println(this.nombre + " recibe " + danio + " de daño. PH restante: " + this.PH); 
     }

    public void mostrar() {
        System.out.println("PH: " + PH);
        System.out.println("ATK: " + ATK);
    }

    public abstract void mostrarHabilidades();
    public abstract void atacar(Peleador objetivo);
    public abstract void atacarManual(Peleador objetivo, int opcion);
}
