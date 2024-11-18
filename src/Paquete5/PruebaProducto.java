package Paquete5;

public class PruebaProducto {
    public static void main(String[] args) {
        //creamos un producto
        Producto producto1 = new Producto("Mouse Logitech", 185000.5, 54);

        producto1.mostrarInfo();


        producto1.nombre = "Mouse Razer";
        producto1.precio = 200000.5;
        producto1.stock = 28;

        producto1.mostrarInfo();

    }
}
