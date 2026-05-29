
package Model;


public class Product {
     //creando valores de la madre
    private final int id;
    private final String nombre;
    private final double precio;
    private final int stock;
     //creaando el constructor
    public Product(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
     //creando lo el mostrar 
    public void mostrarProducto() {
        
        System.out.println("===== PRODUCTO =====");
        System.out.println("ID: " + id);
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: S/" + precio);
        System.out.println("Stock: " + stock);
    }
     //termina el get con id para que me4 pueda mostrar el id 
    public int getId(){
        return id;
    }  
    
}
