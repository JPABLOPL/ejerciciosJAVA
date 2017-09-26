/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioveintitres;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioVeintitres {

    /**
     * Debemos pedir el ancho y el largo de un terreno
     * e informar cuantos metros de alambre necesitamos para dar tres (3)
     * vueltas de alambre
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Double ancho;
        Double largo;
        String dato;
        Double perimetro;
        
        Scanner misc = new Scanner(System.in);
        
        System.out.println("ingrese el ancho: ");
        dato= misc.next();
        ancho = Double.parseDouble(dato);
        
        System.out.println("ingrese el largo: ");
        dato= misc.next();
        largo = Double.parseDouble(dato);

        perimetro= ((ancho*2)+(largo*2))*3;
        System.out.println("el resultado es: " + perimetro);
        
    }
    
}
