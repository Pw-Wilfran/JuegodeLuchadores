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
class Espadachin extends Peleador implements Guerrero, Arquero {

    public Espadachin(String nombre, int vida, int ataque) {
        super(nombre, vida, ataque);
    }

    @Override
    public void atacar(Peleador enemigo) {
        Random random = new Random();
        int ramd = random.nextInt(3) + 1;
        switch (ramd) {
            case 1 -> usarEspada(enemigo);
            case 2 -> dispararFlecha(enemigo);
            case 3 -> cargarDisparo(enemigo);
        }
    }

    @Override
    public void atacarManual(Peleador enemigo, int opcion) {
        switch (opcion) {
            case 1 -> usarEspada(enemigo);
            case 2 -> dispararFlecha(enemigo);
            case 3 -> cargarDisparo(enemigo);
            default -> System.out.println(" Opción invalida.");
        }
    }

    @Override
    public void mostrarHabilidades() {
        System.out.println("1. Ataque con Espada️");
        System.out.println("2. Disparo de Flecha");
        System.out.println("3. Cargar Disparo");
    }

    @Override
    public void usarEspada(Peleador enemigo) {
        System.out.println(nombre + " ataca con su espada a " + enemigo.getNombre());
        enemigo.recibirDanio(ATK);
    }

    @Override
    public void aumentarFuerza() {
        System.out.println(nombre + " aumenta su fuerza temporalmente");
        ATK += 30;
    }

    @Override
    public void dispararFlecha(Peleador enemigo) {
        System.out.println(nombre + " dispara una flecha a " + enemigo.getNombre());
        enemigo.recibirDanio(ATK - 20);
    }

    @Override
    public void cargarDisparo(Peleador enemigo) {
        System.out.println(nombre + " carga un disparo potenciado y ataca");
        enemigo.recibirDanio(ATK + 5);
    }
}