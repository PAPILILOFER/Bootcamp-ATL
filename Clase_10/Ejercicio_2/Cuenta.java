package Clase_10.Ejercicio_2;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta() {

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar() {
        System.out.println("El nombre del titular es: " + titular
                + "\nCantidad actual de su cuenta: $" + cantidad);

    }

    public void ingresar(double cantidadIngresada) {

        if (cantidadIngresada > 0) {
            cantidad += cantidadIngresada;
        }
    }

    public void retirar(double cantidad) {
        this.cantidad -= cantidad;
    }


}
