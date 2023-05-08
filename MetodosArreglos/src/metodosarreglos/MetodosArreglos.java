/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosarreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */

public class MetodosArreglos {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        double Numeros [] = new double[4];

        for (int i = 0; i < Numeros.length; i++){
            System.out.println("Escribir un numero");
            Numeros[i] = Double.parseDouble(br.readLine());
        }

        System.out.println("La suma es: " + Sumar (Numeros));
        System.out.println("El mayor es: " + Mayor (Numeros));
        System.out.println("El menor es: " + Menor (Numeros));
    }
    private static double Sumar(double [] Numeros) {
        double Suma = 0;

        for (int i = 0; i < Numeros.length; i++) {
            Suma = Suma + Numeros[i];
        }
        return Suma;
    }
    private static double Mayor(double [] Numeros) {
        double Mayor = 0;

        for (int i = 0; i < Numeros.length; i++) {
            if (Numeros[1] > Mayor)
            {
                Mayor = Numeros[i];
            }
        }
        return Mayor;
    }
    private static double Menor(double [] Numeros) {
        double Menor = 0;
        
        for (int i = 0; i < Numeros.length; i++) {
            if (Numeros[1] > Menor)
            {
                Menor = Numeros[i];
            }
        }
        return Menor;
    }
}