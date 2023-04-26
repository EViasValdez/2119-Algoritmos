/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarios;

import java.util.Scanner;

/**
 *
 * @author EViasValdez
 */

public class Salarios {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);

        int NElementos;

        System.out.println("Numero de elementos del arreglo");
        NElementos = Leer.nextInt();
        
        double [] Salario = new double [NElementos];
        double Suma = 0;
        int k = 0;

        System.out.println("Ingresa los valores del arreglo");
        for (k = 0; k < NElementos; k++)
        {
            System.out.print("m[" + k + "] = ");
            Salario [k] = Leer.nextDouble();
            Suma = Suma + Salario[k];
        }
        System.out.println("La suma es: " + Suma);
        System.out.println("El promedio es: " + Suma / 10);
    }
}