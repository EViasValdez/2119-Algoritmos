/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areadeltriangulo2;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class AreadelTriangulo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);

        System.out.println("Calcular el area del triangulo");

        System.out.println("Ingresar base");
        int N1 = Leer.nextInt();

        System.out.println("Ingresar altura");
        int N2 = Leer.nextInt();

        int R;
        R = (N1 * N2) / 2;

        System.out.println("El resultado del area es: " + R);
        {
            // else (int = 2);
        }
    }
}