package Vehiculos;

public class Vehiculo {
    String nombre;

    protected Vehiculo(String nombre){
        this.nombre = nombre;
    }

    protected void mostrarVehiculo(){
        System.out.println("Nombre del vehiculo = " + nombre);
    }


}
