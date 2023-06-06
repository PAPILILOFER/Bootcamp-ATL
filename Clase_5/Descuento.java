package Clase_5;
import java.util.Scanner;
public class Descuento {
    public static void main(String[] args) {
        double precioFinal;
        Scanner datos= new Scanner(System.in);
        System.out.println("¿Ingrese el precio original del producto?");
        double Producto = datos.nextDouble();

        System.out.println("¿Ingrese el porcentaje de descuento del producto?");
        double porcentaje = datos.nextDouble();

        precioFinal= Producto-(Producto*porcentaje/100);
        System.out.println("El precio final es de: "+ precioFinal);
    }
}



