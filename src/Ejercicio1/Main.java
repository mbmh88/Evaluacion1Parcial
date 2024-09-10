package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        //lista empleados
        Empleado[] empleados = {
                new Empleado("Juan",28,2500),
                new Empleado("Ana",35,3200),
                new Empleado("Pedro",43,2900)
        };
        //aumento a empleados q califican
        for (Empleado emp: empleados){
            emp.aplicarAumento();
            emp.mostrarDetalles();
            System.out.println("----------");
        }
    }
}