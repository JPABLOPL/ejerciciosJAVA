/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
      al ingresar una edad y el nombre se debe mostra el siguiente mensaje
     * ustde se llama xxx y tiene xxx años de edad
     */
    
    public static void main(String[] args) {
        //int NumeroUno;
        //int NumeroDos;
        //int Suma;
        //Scanner 
        //System.out.println("estoy en el ejercicio 5");
        
        //System.out.println("El resultado es: " + (Suma.in));
        string nombre ;
        int edad ;
        
        Scanner misca = new Scanner (System.in) ;
        
        System.out.println("ingrese el nombre: ");
        
        nombre = misca.nextLine();
       
        System.out.println("usted se llama : " + nombre);
        
        System.out.println("ingresar una edad: ");
        
        edad = misca.nextInt();
        
        System.out.println("usted tiene: " + edad);
        
               
        
    }
    
}
