/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosarray1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author EViasValdez
 */

public class EjemplosArray1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Esta es la lista de animales disponibles");

        Scanner Leer = new Scanner(System.in);
        Random alea = new Random();
        String Animales [] = {"Pez", "Caballo", "Mapache", "Gato", "Oso"};

        ArrayList <String> Animales2 = new ArrayList<String>();

        System.out.println("");
        System.out.println("");

        for (int i = 0; i < Animales.length; i++) {
            System.out.print(Animales [i] + " | ");
            Animales2.add(Animales [i]);
        }
        
        System.out.println("");
        
        int Op = 1;

        while (Op == 1) {
            System.out.println("¿Desea agregar otro animal?");
            Op = Leer.nextInt();

            if (Op == 1) {
                System.out.println("Ingrese un animal");
                Animales2.add("d");
            }
        }
        for (int i = 0; i < Animales2.size(); i++) {
            System.out.println(Animales2.get(i));
        }
    }
}