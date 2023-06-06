package Clase_5;

import java.util.Scanner;

public class EdadPerro {
    public static void main(String[] args) {
        int EdadPerruna = 7;
        int calcular;

        Scanner Ed = new Scanner(System.in);
        System.out.println("¿Ingrese la edad de su perro?");
        int Edad = Ed.nextInt();

        calcular = (Edad * EdadPerruna);
        System.out.println("La edad ingresada a edad de perros es de: " + calcular);
    }
}


