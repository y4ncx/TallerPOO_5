package Ejercicio3;

public class PruebaPersonas {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 40);

        System.out.println("Nombre Inicial = " + persona.getNombre());
        persona.setNombre("Joaquin");


        persona.edad = 26;

        persona.mostrarPersona();

    }
}
