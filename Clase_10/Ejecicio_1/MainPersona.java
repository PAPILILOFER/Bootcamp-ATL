package Clase_10.Ejecicio_1;

import java.util.Scanner;
import java.time.LocalDate;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su id:");
        persona1.setId(input.nextInt());

        System.out.println("Ingrese su nombre:");
        persona1.setNombre(input.next());

        System.out.println("Ingrese su edad:");
        persona1.setEdad(input.nextInt());

        System.out.println("Ingrese su fecha de nacimiento de esta forma (yyyy-mm-dd):");
        String fechaNacimiento = input.next();
        persona1.setFechaNacimiento(String.valueOf(LocalDate.parse(fechaNacimiento)));

        System.out.println("Ingrese su Dni");
        persona1.setDni(input.nextLong());


        persona1.mostrar();
        persona1.esMayorDeEdad();
    }

}
