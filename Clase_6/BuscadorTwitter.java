package Clase_6;

import java.util.Scanner;

/*
        Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
        Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
        Después muestra en consola la concatenación de:
        “https://twitter.com/search?q=” + palabra

 */
public class BuscadorTwitter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Ingrese el nombre de una celebridad ");
        String Celebridad=input.nextLine();
        System.out.println("https://twitter.com/search?q=" + Celebridad);
    }
}
