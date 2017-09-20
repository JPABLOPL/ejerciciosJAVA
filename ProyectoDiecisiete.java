/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodiecisiete;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProyectoDiecisiete {

    /**
     * @param args the command line arguments
     * SE DEBE INGRESAR UNA EDAD E INFORMAR SI ES MAYOR DE EDAD O NO.
     * si es menor a 12 es un niño, si es mayor a 12 y menor a 18 es un
     * adolescente, si es mayor a 18 es un adulto.
     */
    public static void main(String[] args) {
     
    Scanner misc = new Scanner(System.in);
    Integer edad;
    String dato;
    
        System.out.println("ingrese una edad: ");
        dato=misc.next();
        edad=Integer.parseInt(dato);                
        
        //if(edad<13)
        //{
        //    System.out.println("es un niño");
        //}
        //if(edad>18)
        //{
        //    System.out.println("es un adulto");
        //}
        //if(edad>12 && edad<18)
        //{
        //    System.out.println("es un adolescente");
        //}
        if(edad>17)
        {
            System.out.println("es mayor");
        }else
        {
            //son menores a 18
            if(edad<13)
        {
            System.out.println("es niño");
        }else
        {
            System.out.println("es adolescente");
        }
        }
            

    }
    
}
