package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        //lista
        Vehiculo[]vehiculos = {
                new Vehiculo("Toyota ", " Corolla ", 3500),
                new Vehiculo("Honda ", " Civic ", 4500),
                new Vehiculo("Ford ", " Fiesta ",3000),
                new Vehiculo("Chervolet ", " Spank ",2800)
        };
        //mas bajo
        Vehiculo vehiculoMasBarato = null;
        //buscar
        for (Vehiculo v : vehiculos){
            if (v.getPrecio() >= 2500 && v.getPrecio() <= 4000){
                if (vehiculoMasBarato == null || v.getPrecio() < vehiculoMasBarato.getPrecio()){
                    vehiculoMasBarato = v;
                }
            }
        }
        //resultado
        if (vehiculoMasBarato != null){
            System.out.println("El vehiculo con el precio mas bajo entre 2500 y 4000 es: ");
            vehiculoMasBarato.mostrarDetalles();
        }else {
            System.out.println("No se encontro vehiculo en el rango de precios. ");
        }
    }
}