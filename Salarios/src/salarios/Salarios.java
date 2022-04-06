/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarios;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS
 */
public class Salarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        
        int nElementos;
        
        System.out.println("Numero de elementos del arreglo");
        nElementos = leer.nextInt();
        
        double [] salario = new double [nElementos];
        double suma = 0;
        int k = 0;

        System.out.println("Ingresa los valores del arreglo");
        for (k = 0; k < nElementos; k++)
        {
            System.out.print("m[" + k + "] = ");
            salario [k] = leer.nextDouble();
            suma = suma + salario [k];
        }
        System.out.println("La suma es" + suma);
        System.out.println("El promedio es" + suma / 10);
    }
}