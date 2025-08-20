/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */

public class Condicion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        float Precio, Total;
        int Cantidad;

        System.out.println("¿Cual es el precio?");
        Precio = Float.parseFloat(br.readLine());
        System.out.println("¿Cual es la cantidad?");
        Cantidad = Integer.parseInt(br.readLine());

        if (Precio >= 5000)
        {
            System.out.println("Precio muy caro");
        }
        else
        {
            System.out.println("Precio muy barato");
        }

        Total = Precio * Cantidad;
        System.out.println("El total es: " + Total);
    }
}