package Paquete5;

class Producto {
    String nombre;
    double precio;
    int stock;


    //Constructor que inicializa todas las propiedades
    Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

   void mostrarInfo(){
       System.out.println("Nombre = " + nombre);
       System.out.println("Precio = $" + precio);
       System.out.println("Stock = " + stock + "Unidades");

    }


}
