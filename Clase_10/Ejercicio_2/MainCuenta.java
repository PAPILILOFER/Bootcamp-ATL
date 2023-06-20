package Clase_10.Ejercicio_2;

import java.util.Scanner;

public class MainCuenta {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta();
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el nombre del titular:");
        cuenta.setTitular(input.nextLine());

        System.out.println("Ingrese cuanto quiere depocitar a la cuenta:");
        double cantidadIngresada = input.nextDouble();
        cuenta.ingresar(cantidadIngresada);

        System.out.println("Ingrese la cantidad de retiro:");
        double cantidadRetiro = input.nextDouble();
        cuenta.retirar(cantidadRetiro);

        cuenta.mostrar();
    }

}
