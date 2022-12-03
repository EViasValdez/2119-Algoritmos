/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colores;

import java.util.Random;

/**
 *
 * @author EViasValdez
 */
public class Colores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rng = new Random();

        int Numeros [] = new int [100];
        
        for (int i = 0; i < 100; i++)
        {
            Numeros [1] = rng.nextInt (4) + 1;
        }

        int Red = 0;
        int Black = 0;
        int White = 0;
        int Blue = 0;

        for (int i = 0; i < 100; i++) {
            if (Numeros [i] == 1)
            {
                Red++;
            }
            if (Numeros [i] == 2)
            {
                Black++;
            }
            if (Numeros [i] == 3)
            {
                White++;
            }
            if (Numeros [i] == 4)
            {
                Blue++;
            }
        }

        String rojo [] = new String [Red];
        String negro [] = new String [Black];
        String blanco [] = new String [White];
        String azul [] = new String [Blue];

        for (int i = 0; i < 100; i++) {
            if (Numeros [i] == 1)
            {
                rojo [Red] = "rojo";
                Red++;
            }
            if (Numeros [i] == 2)
            {
                negro [Black] = "negro";
                Black++;
            }
            if (Numeros [i] == 3)
            {
                blanco [White] = "blanco";
                White++;
            }
            if (Numeros [i] == 4)
            {
                azul [Blue] = "azul";
                Blue++;
            }
        }
    }
}