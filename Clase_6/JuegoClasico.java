package Clase_6;
/*
        Escribe un programa que permita al usuario jugar el juego clásico de"piedra, papel, tijeras" contra la
        computadora. El programa debe solicitar al usuario que ingrese su elección (piedra, papel o tijeras)
        y luego generar una elección aleatoria para la computadora. Después de eso, el programa debe determinar
        el ganador según las reglas del juego y mostrar el resultado.

 */
import java.util.Random;
import java.util.Scanner;

public class JuegoClasico {
    public static void main(String[] args) {
        int victoryPlayer1 = 0;
        int victoryComputadora = 0;
        int defeatPlayer1 = 0;
        int defeatComputadora = 0;

        String[] elecciones = new String[]{"Piedra", "Papel", "Tijera"};
        Scanner opcion = new Scanner(System.in);
        Random Aleatorio = new Random();
        System.out.println("************* Juego de piedra, papel o tijera *************\n"
                + "Elija una opcion para jugar\n"
                + "0) Pedra\n"
                + "1) Papel\n"
                + "2) Tijera\n");

        while (victoryPlayer1 < 3 && victoryComputadora < 3) {

            int Player1;

            do {
                Player1 = opcion.nextInt();
                switch (Player1) {
                    case 0 -> System.out.println("haz elegido: " + elecciones[0]);
                    case 1 -> System.out.println("haz elegido: " + elecciones[1]);
                    case 2 -> System.out.println("haz elegido: " + elecciones[2]);
                    default -> System.out.println("haz ingresado una opcion invalida, Vuelve a intentarlo");
                }
            } while (!(Player1 >= 0 && Player1 < 3));

            int eleccionComputadora = Aleatorio.nextInt(elecciones.length);
            String Computadora = elecciones[eleccionComputadora];


            System.out.println("La Computadora ha eligido: " + Computadora);


            if (Player1 == eleccionComputadora) {
                System.out.println("Empate");

            } else if (Player1 == 0 && eleccionComputadora == 2 ||
                    Player1 == 1 && eleccionComputadora == 0 ||
                    Player1 == 2 && eleccionComputadora == 1) {
                System.out.println("Ganaste\n");
                victoryPlayer1++;
                defeatComputadora++;


            } else {
                System.out.println("Perdiste\n");

                victoryComputadora++;
                defeatPlayer1++;

            }
            System.out.println("Estadisticas del player1"
                    + "\nVictory: " + victoryPlayer1 + "   "
                    + "Defeat: " + defeatPlayer1 + "\n");

            System.out.println("Estadisticas de la computadora"
                    + "\nVictory: " + victoryComputadora + "   "
                    + "Defeat: " + defeatComputadora + "\n");
        }
        if (victoryPlayer1 >= 3) {
            System.out.println("¡El player1 ha ganado el juego felicidades!");
        } else {
            System.out.println("¡\"¡La computadora ha ganado el juego felicidades!");
        }
    }
}




