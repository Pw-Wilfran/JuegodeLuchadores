package juego_mortalkumbia;

import java.util.Random;
import java.util.Scanner;

public class Juego_MortalKumbia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Elige una clase para tu personaje: 1. Paladin | 2. Espadachin | 3. Hechicero");
        int select = scanner.nextInt();
        
        Peleador jugador1;

        switch (select) {
            case 1 -> jugador1 = new Paladin("Otto", 1000, 120);
            case 2 -> jugador1 = new Espadachin("Tashingi", 1000, 130);
            case 3 -> jugador1 = new Hechicero("Meridio", 1000, 100);
            default -> jugador1 = new Paladin("Otto", 1000, 120);
        }

        Peleador jugador2;
        int enemigo = random.nextInt(3) + 1;
        switch (enemigo) {
            case 1 -> jugador2 = new Paladin("Otto", 1000, 120);
            case 2 -> jugador2 = new Espadachin("Tashingi", 1000, 130);
            case 3 -> jugador2 = new Hechicero("Meridio", 1000, 100);
            default -> jugador2 = new Hechicero("Meridio", 1000, 120);
        }

        System.out.println("\nTu personaje:\n" + jugador1.getNombre() + " de Clase (" + jugador1.getClass().getSimpleName() + ")");
        jugador1.mostrar();
        
        System.out.println("\nLuchador Enemigo:\n" + jugador2.getNombre() + " de Clase (" + jugador2.getClass().getSimpleName() + ")");
        jugador2.mostrar();
        
        System.out.println("\nCOMIENZA LA BATALLA \n");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            System.out.println("\n Tu turno. Elige un ataque:");
            jugador1.mostrarHabilidades();
            System.out.print("> ");
            int opcion = scanner.nextInt();
            jugador1.atacarManual(jugador2, opcion);

            if (!jugador2.estaVivo()) break;

            System.out.println("\n Turno del enemigo...");
            jugador2.atacar(jugador1);
        }

        if (jugador1.estaVivo()) {
            System.out.println("\n" + jugador1.getNombre() + " ha ganado la batalla!");
        } else {
            System.out.println("\n" + jugador2.getNombre() + " ha ganado la batalla!");
        }
        
        scanner.close();
    }
    
}
