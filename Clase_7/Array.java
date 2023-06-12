package Clase_7;

import java.util.Scanner;
/*
        Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
        Después de realizar el ejercicio anterior, agregar que muestre el número
        mayor y el número menor. Ahora, hay que mostrar el promedio. Para hacer
        esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números.
 */


public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Minimo = Integer.MAX_VALUE;
        int Maximo = Integer.MIN_VALUE;
        int[] numero = new int[5];

        for (int Cont = 0; Cont < numero.length; Cont++) {
            System.out.println("Ingrese el numero " + (Cont + 1));

            int Numero = input.nextInt();
            numero[Cont] = Numero;
        }

        System.out.println("Los numero que ingreso fueron");
        for (int Cont = 0; Cont < numero.length; Cont++) {
            System.out.println("----------> " + numero[Cont]);
        }

        System.out.println("Mostrar Mayor y menor de los datos ingresados\n");
        for (int Cont = 0; Cont < numero.length; Cont++) {

            int NumeroGuardado = numero[Cont];
            Minimo = Math.min(Minimo, NumeroGuardado);
            Maximo = Math.max(Maximo, NumeroGuardado);
        }
        System.out.println("El mayor es: " + Maximo);
        System.out.println("El mayor es: " + Minimo + "\n");


        System.out.println("Calcular promedio\n");
        double suma = 0;

        for (int Cont = 0; Cont < numero.length; Cont++) {
            int Numero = numero[Cont];
            suma += Numero;

        }
        System.out.println("La suma de los valores ingresados es: " + suma + "\n");
        double promedio = (suma / numero.length);
        System.out.println("el promedio de los valores ingresados es " + promedio);


    }
}

