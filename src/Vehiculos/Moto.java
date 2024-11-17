package Vehiculos;

public class Moto extends Vehiculo {

    public Moto(String nombre){
        super(nombre);
    }

    public void mostrarMoto(){
        System.out.println("Nombre de la moto = " + nombre);
    }

}
