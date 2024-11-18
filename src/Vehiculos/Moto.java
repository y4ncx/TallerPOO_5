package Vehiculos;

public class Moto extends Vehiculo {

    public Moto(String tipo){
        super(tipo);
    }

    public void mostrarMoto(){
        System.out.println("tipo de moto = " + tipo);
    }

}
