/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosarray;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS
 */
public class EjemplosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Esta es la lista de animales disponibles");
        
        Scanner leer = new Scanner (System.in);
        Random alea = new Random ();
        String animales [] = {"Pez", "Caballo", "Mapache", "Gato", "Oso"};
        
        ArrayList <String> animales2 = new ArrayList <String>();
        
        System.out.println("");
        System.out.println("");
        
        for (int i = 0; i < animales.length; i++){
            System.out.print(animales [i] + "|");
            animales2.add(animales [i]);
        }
        int op = 1;
        
        while (op == 1){
            System.out.println("¿Desea agregar otro animal?");
            op = leer.nextInt();
            
            if (op == 1){
                System.out.println("Ingrese un animal");
                animales2.add("d");
            }
        }
        for (int i = 0; i < animales2.size(); i++){
            System.out.println(animales2.get(i));
        }
    }
}