package Ejercicio2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
    //metodo detalles del vehiculo
    public void mostrarDetalles(){
        System.out.println("Marca"+marca);
        System.out.println("Modelo"+modelo);
        System.out.println("Precio $"+precio);
    }
}
