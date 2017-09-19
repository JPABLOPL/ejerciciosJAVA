/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionueve;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioNueve {

    /**
     * @param args the command line arguments
     * se ingresa la cantidad y precio de un producto y se informa el total a pagar
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato;
        String nombre;
        Integer cantidad;
        Double precio;
        Double precioFinal;
    
        Scanner misca = new Scanner(System.in);
        
        
        
        System.out.println("ingrese la catidad: ");
        dato = misca.next();
        cantidad = Integer.parseInt(dato);
        
        
        
        System.out.println("ingrese el Precio: ");
        dato = misca.next();
        precio = Double.parseDouble (dato);
        
   
        
        System.out.println("ingrese el nombre: ");
        nombre = misca.next(); 
        
        
        
        precioFinal = cantidad *precio;
        System.out.println("el resultado es: " + precioFinal);
        
   
    
   
    
 
    
                
                
    }
    
}
