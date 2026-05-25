
package Model;


public class Product {
      private final String nombre;
    private final double precio;
    private final int stock;

    public Product(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: S/" + precio);
        System.out.println("Stock: " + stock);
    }
}
