/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseis;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     * se necesitan pedir dos numeros y sumarlos, mostrar el resultado
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUno;
        int numeroDos;
        int suma;
        
        Scanner miScaner = new Scanner(System.in);
        System.out.println("ingrese el numero: ");
        numeroUno = miScaner.nextInt();
        System.out.println("numero ingresado: " + numeroUno);
        numeroDos = miScaner.nextInt();
        System.out.println("numero ingresado: " + numeroDos);
        suma = numeroUno + numeroDos;
        System.out.println("la suma: " + suma);
    }
    
}
