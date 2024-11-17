package Ejemplos.EjemploIncorrecto1.PaqueteA;

// Paquete: paqueteA
 package paqueteA;
class Vehiculo {
    String marca;
    Vehiculo(String marca) {
        this.marca = marca;
    }
}
// Paquete: paqueteB
 package paqueteB;
Explicación: Aquí, los atributos nombre y salario tienen acceso de paquete. Esto permite que otras clases dentro del mismo paquete puedan acceder
        a ellos, pero no desde clases fuera del paquete.
        import paqueteA.Vehiculo;
public class Main {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Toyota"); // Error de compilación: Vehiculo no es visible
    }
}