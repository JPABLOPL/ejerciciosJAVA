/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotresrandom;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioTresRandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Teclado = new Scanner(System.in);
        Integer numeroIngresado;
        String datoAux;
        Integer diferencia;
        
        Integer numeroSecreto = 3;//(int) (Math.random()*10)+1;
        
        System.out.println("ingrese el numero: ");
        datoAux = Teclado.next();
        numeroIngresado = Integer.parseInt(datoAux);
        
        if(numeroIngresado==numeroSecreto)
        {
            
            System.out.println("Gano!");
            //diferencia= numeroSecreto-numeroIngresado;
            
        }else
        {
            if(numeroIngresado>numeroSecreto)
            {
                System.out.println("te pasaste");
            }else
            {
                System.out.println("falto");
            }
        }
            //System.out.println("te pasaste!");
            //diferencia= numeroIngresado-numeroSecreto;
        //}
        //es una forma de hacer la resta en valor absoluto
        diferencia= numeroIngresado-numeroSecreto;
        //Integer aux;
        //aux = Math.abs(diferencia);
        diferencia = Math.abs(diferencia);
        //if(numeroIngresado>numeroSecreto) no va!
        {
        switch(diferencia)
        {
            case -1:
            case 1:
                System.out.println("...");
                break;
            case 2:
            case -2:
                System.out.println("cerca");
                break;
            case 3:
            case -3:
                System.out.println("ni cerca");
                break;
            case 4:
                System.out.println("bien lejos");
                break;
            default:
                System.out.println("sos horrible en este juego");
        }
        }//le falta los mensajes a esto
        }//del else if(numeroIngresado==numeroSecreto)
    }

 
