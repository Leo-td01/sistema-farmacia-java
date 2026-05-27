package com.mycompany.nuevo_proyecto;

import Model.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class Nuevo_Proyecto {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner (System.in);
        ArrayList<Product> productos = new ArrayList<>();
        
        int opcion;
        
        do{
             System.out.println("===== SISTEMA DE FARMACIA =====");
             System.out.println("1. Agregar producto");
             System.out.println("2. Mostrar productos");
             System.out.println("3. Salir");
             System.out.print("Seleccione una opción: ");
             opcion = teclado.nextInt();
         
            switch(opcion){
                
                case 1:
                    teclado.nextLine();

                    System.out.print("Nombre del producto: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Precio: ");
                    double precio = teclado.nextDouble();

                    System.out.print("Stock: ");
                    int stock = teclado.nextInt();

                    Product nuevoProducto = new Product(nombre, precio, stock);

                    productos.add(nuevoProducto);

                    System.out.println("¡Producto agregado correctamente!");

                    break;
                    
                case 2:
                    System.out.println("===== LISTA DE PRODUCTOS =====");
                     for (Product p : productos) {
                         
                         p.mostrarProducto();
                         
                         System.out.println("----------------");                   
                     
                     }
                       break;
                
                case 3:
                    System.out.println("Cerrando sistema...");
                    break;
                    
                default:
                        
                    System.out.println("Opción inválida");
            }
        }while (opcion!=3);
        
    }
}
