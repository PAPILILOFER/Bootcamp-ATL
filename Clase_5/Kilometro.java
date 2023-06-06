package Clase_5;

import java.util.Scanner;

public class Kilometro {
    public static void main(String[] args) {
        double kilometro;
        Scanner millas = new Scanner(System.in);
        System.out.println("Ingrese una distancia en millas");
        double Distancia = millas.nextDouble();

        kilometro = (Distancia * 1.60934);
        System.out.print("La millas ingresadas convertidas a  kilometros son :" + kilometro);
    }
}


