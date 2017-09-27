/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteriaferreteejerciciotreintaycinco;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class FerreteriaFerreteEjercicioTreintaYCinco {

    /**
     * @param args the command line arguments
     * Debemos hacer una serie de aplicaciones para este negocio
	35- Las lámparas están al mismo precio de $35 pesos final. 
A. Si compra 6 o más lamparitas bajo consumo tiene un descuento
* del 50%. 
B. Si compra 5 lamparitas bajo consumo marca "ArgentinaLuz" se hace
* un descuento del 40 % y si es de otra marca el descuento es del 30%. 
C. Si compra 4 lamparitas bajo consumo marca "ArgentinaLuz" o
* “FelipeLamparas” se hace un descuento del 25 % y si es de otra marca el descuento es del 20%. 
D. Si compra 3 lamparitas bajo consumo marca "ArgentinaLuz" 
* el descuento es del 15%, si es “FelipeLamparas” se hace un descuento del 10 % y si es de otra marca un 5%. 

     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado =new Scanner(System.in);
        String marca;
        String Aux;
        Integer cantidad;
        Integer precio=35;
        Integer precioBruto;
        Double precioFinal=(double)0;
        
        System.out.println("ingrese marca: ");
        marca = teclado.next();
        
        System.out.println("ingrese catidad: ");
        Aux= teclado.next();
        cantidad=Integer.parseInt(Aux);
        
        precioBruto= cantidad*precio;
        
        if(cantidad>5)
        {
        precioFinal=precioBruto*0.5;
        }else
        //System.out.println("debe pagar " + precioFinal);
        {
        if(cantidad==5)
        {
        if(marca.equals("ArgentinaLuz"))
        {
        precioFinal= precioBruto*0.6;
        }else
        {
        precioFinal= precioBruto*0.7;
        }
        }else
        {
        //todos los menores a 5
            if(cantidad==4)
            {
            if(marca.equals("ArgentinaLuz") 2 marca.equals("FelipeLamparasa"))
            {
            precioFinal= precioBruto*0.8;
            }
            }else
            {
            //terminar en casa
            }
        }
        }
    }
        
        
    }
