/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_mortalkumbia;

import java.util.Random;

/**
 *
 * @author wilfr
 */
class Hechicero extends Peleador implements Mago, Arquero {

    public Hechicero(String nombre, int vida, int ataque) {
        super(nombre, vida, ataque);
    }

    @Override
    public void atacar(Peleador enemigo) {
        Random random = new Random();
        int ramd = random.nextInt(2) + 1;
        switch (ramd) {
            case 1 -> lanzarHechizo(enemigo);
            case 2 -> dispararFlecha(enemigo);
        }
    }

    @Override
    public void atacarManual(Peleador enemigo, int opcion) {
        switch (opcion) {
            case 1 -> lanzarHechizo(enemigo);
            case 2 -> dispararFlecha(enemigo);
        }
    }

    @Override
    public void mostrarHabilidades() {
        System.out.println("1. Hechizo Magico");
        System.out.println("2. Disparo de Flecha");
    }

    @Override
    public void lanzarHechizo(Peleador enemigo) {
        System.out.println(nombre + " lanza un hechizo magico a " + enemigo.getNombre());
        enemigo.recibirDanio(ATK + 30);
    }

    @Override
    public void recargarMana() {
        System.out.println(nombre + " recarga su mana.");
    }

    @Override
    public void dispararFlecha(Peleador enemigo) {
        System.out.println(nombre + " dispara una flecha mágica a " + enemigo.getNombre());
        enemigo.recibirDanio(ATK - 20);
    }

    @Override
    public void cargarDisparo(Peleador enemigo) {
        System.out.println(nombre + " carga un disparo mágico potenciado");
        enemigo.recibirDanio(ATK + 50);
    }
}
