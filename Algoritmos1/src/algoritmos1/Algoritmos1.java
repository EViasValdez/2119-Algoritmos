/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos1;

import java.util.Scanner;

/**
 *
 * @author EViasValdez
 */
 
public class Algoritmos1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);

        System.out.println("Numero");
        int N1 = Leer.nextInt();

        if (N1 < 1 && N1 > 3)
        {
            System.out.println("Dato incorrecto");
            } else {
            System.out.println("Dato correcto");
        }
    }
}