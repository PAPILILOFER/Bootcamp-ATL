package Clase_5;

import java.util.Scanner;

public class Propina {
    public static void main(String[] args) {
        double Propina;
        Scanner datos = new Scanner(System.in);

        System.out.println("Ingrese el total de la cuenta en un restaurante");
        double totalCuenta = datos.nextDouble();

        System.out.println("ingrese el porcentaje de propina que desea dejar");
        double porcentajePropina = datos.nextDouble();

        Propina= totalCuenta * (porcentajePropina / 100);
        System.out.println("La propina es de: "+ Propina);
    }
}





