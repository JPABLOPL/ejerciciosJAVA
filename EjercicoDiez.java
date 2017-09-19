/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicodiez;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicoDiez {

    /**
     * @param args the command line arguments
     * se pide ingresar la cantidad de ganadores de la loteria nacional y el monto total del premio
     * informar cuanto dinero le corresponde a cada uno
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato;
        Integer cantidad;
        Double monto;
        Double premio;
        Scanner loteria = new Scanner(System.in);
        
        
        
        System.out.println("ingrese el monto: ");
        dato= loteria.next();
        monto= Double.parseDouble(dato);
        
        
        
        System.out.println("ingrese la cantidad de ganadores: ");
        dato= loteria.next();
        cantidad= Integer.parseInt(dato);
        
        
        
        premio= monto / cantidad;
        System.out.println("el resultado es: " + premio);
        
        
        
        
        
       
        
        
    }
    
}
