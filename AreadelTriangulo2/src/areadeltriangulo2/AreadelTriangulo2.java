/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areadeltriangulo2;

import java.util.Scanner;

/**
 *
 * @author EViasValdez
 */
 
public class AreadelTriangulo2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);

        System.out.println("Calcular el área del triangulo");

        System.out.println("Ingresar base");
        int N1 = Leer.nextInt();

        System.out.println("Ingresar altura");
        int N2 = Leer.nextInt();

        int R;
        R = (N1 * N2) / 2;

        System.out.println("El resultado del área es: " + R);
        {
            // else (int = 2);
        }
    }
}