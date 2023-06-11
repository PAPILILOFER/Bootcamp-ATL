package Clase_6;

import java.util.Scanner;

//Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor.
public class MayorMenor {
    public static void main(String[] args) {
        Scanner Num = new Scanner(System.in);

        int Minimo = Integer.MAX_VALUE;
        int Maximo = Integer.MIN_VALUE;
        int Numero = 0;

        int i = 0;
        while (i < 3) {
            System.out.println("ingrese numero" + (i + 1));
            Numero = Num.nextInt();
            Minimo = Math.min(Minimo, Numero);
            Maximo = Math.max(Maximo, Numero);
            i++;

        }

        System.out.println("el numero mayor es: " + Maximo);
        System.out.println("el numero menor es: " + Minimo);
    }

}
