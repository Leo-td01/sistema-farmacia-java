package com.mycompany.nuevo_proyecto;

import Model.Product;
import java.util.ArrayList;
import java.util.Scanner;

public class Nuevo_Proyecto {

    public static void main(String[] args) {
        
        Scanner teclado=new Scanner (System.in);
        ArrayList<Product> productos = new ArrayList<>();
        
        int opcion;
        int contadorId = 1;
        
        do{
            //usuario ingresa valores
             System.out.println("===== SISTEMA DE FARMACIA =====");
             System.out.println("1. Agregar producto");
             System.out.println("2. Mostrar productos");
             System.out.println("3. Buscar producto");
             System.out.println("4. salir");
             System.out.print("Seleccione una opción: ");
             opcion = teclado.nextInt();
         
            switch(opcion){
                //se agragan valores
                case 1:
                    //creando id automatico
                    int id = contadorId;
                    //pide nombre
                    System.out.print("Nombre del producto: ");
                    String nombre = teclado.nextLine();
                    teclado.nextLine();
                     //pide precio
                    System.out.print("Precio: ");
                    double precio = teclado.nextDouble();
                    teclado.nextLine();
                     //pide stock
                    System.out.print("Stock: ");
                    int stock = teclado.nextInt();
                    teclado.nextLine();
                    //guarda en el constructor
                    Product nuevoProducto = new Product(id, nombre, precio, stock);
                     //se crea nuevo valor 
                    productos.add(nuevoProducto);
                    //por cada producto creado se suma uno en el id haciendolo unico
                    contadorId++;
                    
                    System.out.println("¡Producto agregado correctamente!");
                    
                    
                    break;
                //muestra la lista de productros guardados  
                case 2:
                    System.out.println("===== LISTA DE PRODUCTOS =====");
                     for (Product p : productos) {
                         //muestra los productos guardados
                         p.mostrarProducto();
                          //separador de lineas
                         System.out.println("----------------");                   
                     
                     }
                       break;
                //busca la id de los productos guardados       
                case 3:
                     //pide id a buscar
                    System.out.print("Ingrese ID a buscar: ");
                    int buscarId = teclado.nextInt();
                     //crea un valor booleano para buscar si existe el valor solicitado
                    boolean encontrado = false;
                     //empieza a buscar producto por producto 
                    for(Product p: productos){
                         //si el id del producto es igual al id solicitado
                        if(p.getId()==buscarId){
                            
                             //muestra el producot
                        p.mostrarProducto();
                         //para la accion
                        encontrado = true;
                        }
                    }
                     //si el id no existe 
                    if(!encontrado){
                    
                        System.out.println("Producto no encontrado");
                        
                    }
                    break;
                //cierra el programa 
                case 4:
                    System.out.println("Cerrando sistema...");
                    break;
                    
                default:
                         //en caso de que pongan un 5 a mas
                    System.out.println("Opción inválida");
            }
        //el final del programa
        }while (opcion!=4);
        
    }
}
