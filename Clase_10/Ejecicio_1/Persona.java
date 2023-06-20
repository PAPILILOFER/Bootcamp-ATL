package Clase_10.Ejecicio_1;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String fechaNacimiento;
    private long dni;

    public Persona() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void mostrar() {

        System.out.println("ID: " + id +
                "\nNombre: " + nombre +
                "\nEdad: " + edad +
                "\nFecha de nacimiento: " + fechaNacimiento +
                "\nDNI: " + dni);
    }

    public void esMayorDeEdad() {
        if (edad >= 18) {
            System.out.println("Es mayor de edad tiene: " + edad);
        } else {
            System.out.println("Usted es menor de edad");
        }

    }

}




