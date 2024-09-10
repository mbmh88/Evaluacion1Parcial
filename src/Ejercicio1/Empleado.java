package Ejercicio1;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    //constructor
    public Empleado(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    //get salario

    public double getSalario() {
        return salario;
    }
    //metodo aumento de salario
    public void aplicarAumento(){
        if (salario < 3000){
            salario += salario*0.10;//aumento de 10%
        }
    }
    //mostrar detalles del empleado
    public void mostrarDetalles(){
        System.out.println("Nombre"+nombre);
        System.out.println("Edad"+edad);
        System.out.println("Salario"+salario);
    }
}
