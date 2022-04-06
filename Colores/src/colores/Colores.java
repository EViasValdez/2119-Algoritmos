/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colores;

import java.util.Random;

/**
 *
 * @author ALUMNOS
 */
public class Colores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rng = new Random();

        int numeros [] = new int [100];
        for (int i = 0; i < 100; i++)
        {
            numeros [1] = rng.nextInt (4) + 1;
        }

        int red = 0;
        int black = 0;
        int white = 0;
        int blue = 0;

        for (int i = 0; i < 100; i++){
            if (numeros [i] == 1)
            {
                red++;
            }
            if (numeros [i] == 2)
            {
                black++;
            }
            if (numeros [i] == 3)
            {
                white++;
            }
            if (numeros [i] == 4)
            {
                blue++;
            }
        }

        String rojo [] = new String [red];
        String negro [] = new String [black];
        String blanco [] = new String [white];
        String azul [] = new String [blue];

        for (int i = 0; i < 100; i++){
            if (numeros [i] == 1)
            {
                rojo [red] = "rojo";
                red++;
            }
            if (numeros [i] == 2)
            {
                negro [black] = "negro";
                black++;
            }
            if (numeros [i] == 3)
            {
                blanco [white] = "blanco";
                white++;
            }
            if (numeros [i] == 4)
            {
                azul [blue] = "azul";
                blue++;
            }
        }
        for (int i = 0; i < 100; i++){
        {
            
        }
        }
    }   
}