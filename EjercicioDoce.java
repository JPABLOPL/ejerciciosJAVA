;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodoce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDoce {

    /**
     * @param args the command line arguments
     * se ingresa el importe de un producto importado y se le debe agregar el 35%
     * de impuestos internos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dato;
        Integer cantidad; 
        Integer valor;
        Double porcentaje;
        Double resultado;
        
    
        
        Scanner misca = new Scanner(System.in);
        
        
        
        System.out.println("ingrese el valor: ");
        dato= misca.next();
        valor= Integer.parseInt(dato);
        
        
        System.out.println("ingrese el porcentaje: ");
        dato= misca.next();
        porcentaje= Double.parseDouble(dato);
        
        
        System.out.println("ingrese la cantidad: ");
        dato= misca.next();
        cantidad= Integer.parseInt(dato);
        
        resultado= ((valor* porcentaje/100)+ valor)* cantidad;
        System.out.println("el resultado es: " +resultado);
        
        
        
        
    }
    
}
