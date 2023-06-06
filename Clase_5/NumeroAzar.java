package Clase_5;

import java.util.Scanner;

public class NumeroAzar {
    public static void main(String[] args) {

        int i=0;

        System.out.println("Juego de Adivinar el numero");
        System.out.println("Tiene maxima 3 intentos");

        while(i<3){
            System.out.println("intento numero: "+ (i+1));
            Scanner num = new Scanner(System.in);
            System.out.println("Ingresa un numero entre 1 y 100");
            int numero = num.nextInt();

            int azar = (int) (Math.random() * 100+1);
            System.out.println("el numero del azar es:"+azar);
            if (azar == numero) {
                System.out.println("Felicidades haz acertado");
                break;
            } else {
                System.out.println("No haz acertado sigue intentando");
            }
            i++;
        }
    }
}


