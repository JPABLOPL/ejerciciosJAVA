xt/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchdos;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class SwitchDos {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado =new Scanner(System.in);
        Integer mesDelAño;
        /**
         * leemos la varible .next()
         * parseamos
         */
        String dato= teclado.next();
        mesDelAño=Integer.parseInt(dato);
        
        
        switch(mesDelAño)
        {
            case  1 :
                System.out.println("es verano");
        }
    }
    
}
