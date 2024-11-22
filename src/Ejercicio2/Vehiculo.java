package Ejercicio2;

public class Vehiculo {
    String tipo;

    protected Vehiculo(String tipo){
        this.tipo = tipo;
    }

    protected void mostrarVehiculo(){
        System.out.println("tipo de vehiculo = " + tipo);
    }


}
