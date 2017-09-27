/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteraccionwhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class IteraccionWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner Aux = new Scanner(System.in);
        String clave;
        
        System.out.println("ingrese clave: ");
        clave="1234";// Aux.next();
        
        /*
        if(clave.equals(1234))
        {
            System.out.println("Bienvenido");
        }else
        {
            System.out.println("RE-ingrese clave: ");
            clave= Aux.next();
        
        if(clave.equals(1234))
        {
            System.out.println("Bienvenido");
        }else
        {
            System.out.println("RE-ingrese clave: ");
            
        }
        }*/
        while(!clave.equals("1234"))
        {
            System.out.println("Error Re-Ingrese clave: ");
            clave= Aux.next();
        }
        System.out.println("Bienvenido");
                
//en while nunca uso if para variar
//el contador es una variable como cualquier otra que almacena datos
        Integer miContador=0;

        while(miContador<3)
        {
            System.out.println(miContador+" ...contando");
            miContador=miContador+1;
        }
            System.out.println("termine");
            }
}
