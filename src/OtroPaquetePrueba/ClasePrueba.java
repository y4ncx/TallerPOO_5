package OtroPaquetePrueba;
import Vehiculos.Moto;
import Vehiculos.Vehiculo;

public class ClasePrueba {
    public static void main(String[] args) {
        Moto moto = new Moto("Kawasaki H2R");

        moto.mostrarMoto();

       // moto.mostrarVehiculo();   Aca tenemos una forma erronea, ya que el metodo mostrarVehiculo() se encuentra Protegido

    }
}
