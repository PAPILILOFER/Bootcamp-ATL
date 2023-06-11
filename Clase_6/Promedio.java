package Clase_6;

import java.util.Scanner;

//Armar un programa que permita cargar 3 números y mostrar cual es el número promedio
public class Promedio {
    public static void main(String[] args) {

        System.out.println("\n*********** Calculadora de promedios ***********\n");

        Scanner num = new Scanner(System.in);
        double promedio = 0;
        double suma = 0;

        int i = 0;
        while (i < 3) {
            System.out.println("ingrese el valor " + (i + 1));
            double numero = num.nextDouble();
            suma = suma + numero;
            promedio = (suma) / 3;
            i++;
        }
        System.out.println("La suma de los numeros ingresados es: " + suma);
        System.out.println("El promedio de los numeros ingresados es: " + promedio);
    }
}
