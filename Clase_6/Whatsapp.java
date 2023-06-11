package Clase_6;

import java.util.Scanner;

/*
        Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
        Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
        Después muestra en consola la concatenación de:
        “https://api.whatsapp.com/send?phone=” + telefono

 */
public class Whatsapp {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese un numero de whatsapp ");
        Long Telefono=input.nextLong();
        System.out.println("https://api.whatsapp.com/send?phone=" + Telefono);
    }
}
