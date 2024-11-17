package Personas;

public class Persona {
    private String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    String getNombre(){
        return nombre;
    }

    void setNombre(String nombre){
        this.nombre = nombre;
    }

    void mostrarPersona(){
        System.out.println("Nombre = " + nombre);
        System.out.println("Edad = " + edad);
    }


}
