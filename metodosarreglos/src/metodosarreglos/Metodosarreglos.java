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
 * @author ALUMNOS
 */
public class Metodosarreglos {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        
        double numeros [] = new double [4];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Escribir un numero");
            numeros [i] = Double.parseDouble(br.readLine());
        }

        System.out.println("La suma es"+ sumar (numeros));
        System.out.println("El mayor es"+ mayor (numeros));
        System.out.println("El menor es"+ menor (numeros));
    }
    private static double sumar(double [] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++){
            suma = suma + numeros [i];
        }
        return suma;
    }
    private static double mayor(double [] numeros) {
        double mayor = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros [1] > mayor)
            {
                mayor = numeros [i];
            }
        }
        return mayor;
    }
    private static double menor(double [] numeros) {
        double menor = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros [1] > menor)
            {
                menor = numeros [i];
            }
        }
        return menor;
    }
}