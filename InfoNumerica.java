/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infonumerica;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class InfoNumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miTeclado= new Scanner(System.in);
        String Aux;
        Integer NumeroIngresado;
        
        //se brinda la informacion sobre un numero ingresado.
        //operadores de busqueda
        //operadores modulo % devuleve el resto entre dos numero ;
        //el resto es lo que sobra en el cociente pero en modulo ;
        /*
        Integer NumeroUno;
        Integer NumeroDos;
        Integer Resultado;
        NumeroDos=10;
        NumeroUno=2;
        */
        /*
        Resultado=2%10;
        System.out.println("el resultado 2%10 es: " +Resultado);
        Resultado=10%2;
        System.out.println("el resultado 10%2 es:" +Resultado);
        */
        System.out.println("ingrese un numero: ");
        Aux=miTeclado.next();
        NumeroIngresado= Integer.parseInt(Aux);
        //Integer NumeroIngresado;
        
        //Aux= miTeclado.next();
        //NumeroIngresado= Integer.parseInt(Aux);
        
        /*
        1- se informa el mayor o menor a 100
        2- informar si es positivo o negativo
        3-informar si es par
        */
        
        /*
        EJERCICIO 1
        
                if(NumeroIngresado>100)
        {
            System.out.println("es mayor a 100");
        }else
        {
        if(NumeroIngresado<100)
        {
            System.out.println("es menor a 100");
        }
        }
        //*/
        
        /*
        EJERCICIO 2
        
        if(NumeroIngresado>0)
        {
            System.out.println("su numero es positivo");
        }else
        {
           if(NumeroIngresado<0)
        {
        System.out.println("su numero es negativo");
        }
        OTRA MANERA DE RESOLVERLO:
        if (NumeroIngresado!=0)
        {
        if(NumeroIngresado>0)
        {
        System.out.println("positivo");
        }else
        {
        System.out.println("negativo");
        }
        }
        */
        
        /*
        EJERCICIO 3
        
      if (NumeroIngresado%2==0)
      {
          System.out.println(NumeroIngresado+" es par");
      }else
      {
          System.out.println(NumeroIngresado+" es impar");
      }
        */
    
    }
}
    

