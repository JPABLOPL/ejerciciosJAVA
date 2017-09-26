/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioswitch;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioSwitch {

    /**
     * vamos a pedir un mes del año
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mesDelAño;
        Integer edad;
        String dato;
        String vacaciones;
        Scanner miTeclado= new Scanner(System.in);
        System.out.println("vas de vacaciones");
        vacaciones= miTeclado.next();
        //si la persona es > de 80 años y va de vacaciones en invierno mostrar 
        //"vacunate contra la gripe"
        System.out.println("ingrese su edad:");
        dato= miTeclado.next();
        edad= Integer.parseInt(dato);
        if (vacaciones.equals("si"))
        {
        //aprendemos a utilizar el switch
            System.out.println("ingrese mes del año: ");
            mesDelAño= miTeclado.next();
            switch (mesDelAño)
        {
            case "enero" :
            case "febrero" :
                System.out.println("lindo veranito!!!");
                break;
            case "julio" :
               System.out.println("lindo invierno!!!");
               if(edad>80)
               {
               System.out.println("vacunate contra la gripe");
               }
                break;
                //para todo el resto usamos default
            default:
                System.out.println("no es verano!!!");
                //break le da fin al case
                break;
        }
        }
        
        
    }
    
}
