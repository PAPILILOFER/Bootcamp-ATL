package Clase_6;

//Crear un programa que cuente una historia al estilo de “Elige tu propia Aventura”.

import java.util.Scanner;

public class HistoriaDinamica {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cual es tu nombre ");
        String NombreAventurero = input.nextLine();
        System.out.println("Bienvenido a esta aventura "+ NombreAventurero+"\n");
        System.out.println("En lo profundo de un antiguo bosque, un valiente explorador llamado Alex se encuentra frente de\n"
                + "un enigma ancestral. Frente a él hay dos puertas misteriosas. Cada puerta tiene un símbolo tallado \n"
                + "una llave en la puerta izquierda y una espada en la puerta derecha. ¿Qué opción eliges " + NombreAventurero + "?");


        System.out.println("1.\tAbrir la puerta de la llave.\n" +
                "2.\tAbrir la puerta de la espada.");

        int opcionInicio = 0;

        while (!(opcionInicio < 3 && opcionInicio > 0)) {
            opcionInicio = input.nextInt();

            if (opcionInicio == 1) {
                System.out.println("Haz elegido la opcion 1\n" +
                        "Alex decide abrir la puerta de la llave. Al entrar, se encuentra con una habitación llena de tesoros y joyas brillantes.\n"
                        + "Sin embargo, también hay un enemigo acechando en la sombra. ¿Qué decide hacer " + NombreAventurero + "?");

                System.out.println("1.\tTomar algunos tesoros y tratar de escapar sigilosamente.\n"
                        + "2.\tEnfrentar al enemigo y luchar por los tesoros.)");

                int Tesoro = 0;

                while (!(Tesoro < 3 && Tesoro > 0)) {

                    Tesoro = input.nextInt();
                    if (Tesoro == 1) {
                        System.out.println("Haz legido la opcion 1\n"
                                + "Alex toma algunos tesoros y trata de escapar sigilosamente. Sin embargo, el\n"
                                + "enemigo se da cuenta y comienza a perseguirlo. Alex corre velozmente a través del bosque, con el\n"
                                + "enemigo pisándole los talones. Finalmente, encuentra un río y toma una decisión crucial.\n"
                                + "¿Qué decide hacer" + NombreAventurero + "?");
                    } else if (Tesoro == 2) {
                        System.out.println("Haz legido la opcion 2\n"
                                + "Alex decide enfrentar al enemigo y luchar por los tesoros. Utilizando su valentía y habilidades de combate, se enzarza en una intensa batalla.\n"
                                + "Después de una dura lucha, Alex emerge victorioso, asegurándose los tesoros como recompensa por su valentía.");
                    } else {
                        System.out.println("Opcion incorrecta intentelo nueva mente");
                    }
                }
                System.out.println("1.\tSaltar al río y nadar para escapar.\n"
                        + "2.\tIntentar cruzar el río por un puente cercano.");

                int escapar = 0;

                while (!(escapar < 3 && escapar > 0)) {
                    escapar = input.nextInt();

                    if (escapar == 1) {
                        System.out.println("Haz legido la opcion 1\n"
                                + "Alex salta al río y nada con todas sus fuerzas para escapar. Afortunadamente, el enemigo no puede seguirlo al agua.\n"
                                + "Alex logra escapar y regresa a salvo a su hogar con los tesoros que ha conseguido.");

                    } else if (escapar == 2) {
                        System.out.println("Haz legido la opcion 2\n"
                                + "Alex intenta cruzar el río por un puente cercano. A medida que cruza, el enemigo lo alcanza y comienza una feroz batalla.\n"
                                + "Después de una lucha intensa, Alex finalmente derrota al enemigo y continúa su camino, triunfante pero agotado.");
                    } else {
                        System.out.println("Opcion incorrecta intentelo nueva mente");
                    }
                }
                System.out.println("\nFin de la aventura\n"
                        + "Espero te hallas divertido " + NombreAventurero + ":)");


            } else if (opcionInicio == 2) {

                System.out.println("Haz legido la opcion 2\n"
                        + "Alex decide abrir la puerta de la espada. Al entrar, se encuentra en una sala oscura y silenciosa.\n"
                        + "En el centro, hay un pedestal con una espada antigua y poderosa. La espada parece radiar energía.\n"
                        + "¿Qué decide hacer" + NombreAventurero + "?");

                System.out.println("1.\tTomar la espada y utilizar su poder para cumplir sus objetivos.\n"
                        + "2.\tDejar la espada y continuar explorando sin armas.");

                int espada = 0;

                while (!(espada < 3 && espada > 0)) {

                    espada = input.nextInt();


                    if (espada == 1) {
                        System.out.println("Haz legido la opcion 1\n"
                                + "Alex toma la espada y siente su poder fluir a través de él. Ahora es más fuerte y confiado que nunca.\n"
                                + "Con la espada en mano, continúa su exploración con una determinación renovada.");


                    } else if (espada == 2) {

                        System.out.println("Haz legido la opcion 2\n"
                                + "Alex decide dejar la espada y continuar explorando sin armas. Confía en sus habilidades y su ingenio\n"
                                + "para superar cualquier desafío que encuentre en su camino.");

                    } else {

                        System.out.println("Opcion incorrecta intentalo nuevamente");

                    }

                }
                System.out.println("\nFin de la aventura\n"
                        + "Espero te hallas divertido " + NombreAventurero + ":)");
            }
            System.out.println("Opcion incorrecta intentalo nuevamente");
        }
    }
}

