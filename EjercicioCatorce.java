/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocatorce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCatorce {

    /**
     * @param args the command line arguments
     * se pide ingresar una clave, si es utn 750 se mostrara el mensaje bienvenido, 
     * de lo contrario el mensaje clave erronea
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato;
        String clave;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingrese una clave: ");
        clave = teclado.next();
        
        
        
        if(clave.equals("utn750"))
        {
            System.out.println("bienvenido");
        }else
        {
            System.out.println("clave erronea");
        }
    }
    
}
