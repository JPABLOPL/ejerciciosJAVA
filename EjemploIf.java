/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploif;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc = new Scanner(System.in);
        //defino variables
        String clave;
        String nombre;
        
        
        //tomo datos
        System.out.println("ingrese nombre");
        nombre= misc.next();
        
        System.out.println("ingrese clave");
        clave= misc.next();
        
        if (clave.equals ("admin"))
        {
            System.out.println("bienvenido administrador");
        }else
        {
            System.out.println("bienvenido: " + nombre);
    
    }
        
    }
    
}
