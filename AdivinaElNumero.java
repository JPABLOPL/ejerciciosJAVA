/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Integer numero;
String DatoAux;
Integer numeroIngresado;
Scanner teclado = new Scanner(System.in);


Integer miNumeroSecreto = 5; //(int) (Math.random()*10)+1;

//System.out.println("numero secreto: "+miNumeroSecreto);
System.out.println("ingrese el numero: ");        
DatoAux= teclado.next();

numeroIngresado=Integer.parseInt(DatoAux);
        
if(miNumeroSecreto == numeroIngresado)
{
    System.out.println("gano");
}else
{
    if(numeroIngresado> miNumeroSecreto)
{
    System.out.println("te pasaste");
}else
        System.out.println("te falto");   
}        
}
    }

/**
 * informar si: 
 * A- si le erro por un punto mensaje "casi casi"
 * B- si le erro por dos puntos "cerca"
 * C- si le erro por tres puntos "ni cerca"
 * D- si le erro por cuatro ountos "bien lejos"
 * E- para todo lo demas "sos horrible en este juego"
 * se puede resolver con un switch
 * harcodear!
 * 
 */