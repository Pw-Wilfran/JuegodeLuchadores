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
class Paladin extends Peleador implements Guerrero, Mago {

    public Paladin(String nombre, int vida, int ataque) {
        super(nombre, vida, ataque);
    }

    @Override
    public void atacar(Peleador enemigo) {
        Random random = new Random();
        int ramd = random.nextInt(4) + 1;
        switch (ramd) {
            case 1 -> usarEspada(enemigo);
            case 2 -> lanzarHechizo(enemigo);
            case 3 -> recargarMana();
            case 4 -> aumentarFuerza();
        }
    }

    @Override
    public void atacarManual(Peleador enemigo, int opcion) {
        switch (opcion) {
            case 1 -> usarEspada(enemigo);
            case 2 -> lanzarHechizo(enemigo);
            case 3 -> recargarMana();
            case 4 -> aumentarFuerza();
            default -> System.out.println("Opción invalida.");
        }
    }

    @Override
    public void mostrarHabilidades() {
        System.out.println("1. Ataque con Espada️");
        System.out.println("2. Hechizo Sagrado");
        System.out.println("3. Recargar Mana");
        System.out.println("4. Aumentar Fuerza");
    }

    @Override
    public void lanzarHechizo(Peleador enemigo) {
        System.out.println(nombre + " lanza un hechizo sagrado a " + enemigo.getNombre());
        enemigo.recibirDanio(ATK);
    }

    @Override
    public void recargarMana() {
        System.out.println(nombre + " recarga su mana.");
    }

    @Override
    public void usarEspada(Peleador enemigo) {
        System.out.println(nombre + " ataca con su espada");
        enemigo.recibirDanio(ATK);
    }

    @Override
    public void aumentarFuerza() {
        System.out.println(nombre + " se fortalece");
        ATK += 30;
    }
}
