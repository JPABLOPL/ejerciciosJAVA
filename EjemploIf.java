/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploif;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner misc = new Scanner(System.in);
    //defino variables
     String clave;
     String nombre;
     String sexo;
     String localidad;
     String colorFavorito;
        
    //tomo datos
    System.out.println("ingrese nombre");
    nombre= misc.next();
        
    //System.out.println("ingrese clave");
    //clave= misc.next();
        
    //System.out.println("ingrese sexo: ");
    //sexo= misc.next();
        
    System.out.println("ingrese localidad");
    localidad= misc.next();
        
    System.out.println("ingrese color favorito");
    colorFavorito= misc.next();
        
    //if(colorFavorito.equals("celeste") || colorFavorito.equals("blanco"))
    //if(colorFavorito.equals("celeste") || colorFavorito.equals("blanco"))
    // !! es la proposicion "o" .....   && es la proposicion "y"
    //{
    //System.out.println("sos un patriota " + nombre);
    //}
    //if (clave.equals ("admin"))
    //{
    //  System.out.println("bienvenido administrador");
    //}else
    //{
    //  System.out.println("bienvenido: " + nombre);
    //}
     
    //ingresa m para masculino, f para femenino
    // si es f que diga feliz dia de la mujer
    // if(localidad.equals("lanus"))
    //{
    //System.out.println("bienvenida " + nombre );
    //}
    //if(sexo.equals("f"))
    //{
    //System.out.println("feliz dia de la mujer");
    //}
    //if(localidad.equals("lanus")&& sexo.equals("f"))
    //{
    // el && en algebra booleana es multiplicar y verdadero es igual a 1 y 
    //falso es igual a 0
    //trabajar por corto circuito es ebular el && si es falsa la primer proposicion
    //entonces no sigue con el proceso.
    //  System.out.println("bienvenida");    
    //}
    
   /**
    * SI ES MASCULINO QUE VIVA EN LANUS O EN AVELLANEDA Y QUE SU COLOR FAVORITO 
    * SEA EL ROJO MOSTRAR EL MENSAJE SOS DE INDEPENDIENTE. 
    * 
    * SI EL NOMBRE ES ANDREA LA LOCALIDAD ES MORON Y EL COLOR FAVORITO ES VERDE 
    * O AZUL SE LE PONE EL MENSAJE FELIZ PRIMAVERA
    */ 
   
   if(nombre.equals("andrea") && localidad.equals("moron") && colorFavorito.equals("verde"))
   {
       System.out.println("feliz primavera"); 
     //System.out.println("sos de independiente");
   }
   /**
    * SE PIDE EL SEXO SI "F" DE FEMENINO, SE MUESTRA EL MENSAJE "FELIZ DIA XXX"
    * DONDE XXX ES EL NOMBRE.
    * SE PIDE EL NOMBRE, EL SEXO Y LA LOCALIDAD. SI SE LLAMA JOSE O MARIA Y ES
    * DE SEXO MASCULINO Y VIVE EN MORON, SE MUESTRA EL MENSAJE "SOS DE MORON".
    * SE DEBE INGRESAR UNA EDAD E INFORMAR SI ES MAYOR DE EDAD O NO.
    */
  }
}
