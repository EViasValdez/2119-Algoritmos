/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

import java.util.Scanner;

/**
 *
 * @author EViasValdez
 */
public class Algoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);

        System.out.println("Numero");
        int n1 = leer.nextInt();

        if (n1 < 1 && n1 > 3) {
            System.out.println("Dato incorrecto");
            }else{
            System.out.println("Dato correcto");
        }
    }
}