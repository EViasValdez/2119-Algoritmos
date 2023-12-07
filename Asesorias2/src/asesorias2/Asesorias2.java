/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asesorias2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */

public class Asesorias2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);    

        float Precio, Descuento = 0, PrecioTotal = 0;
        System.out.println("Escribe un precio");

        Precio = Float.parseFloat(br.readLine());

        if (Precio < 0)
        {
            System.out.println("Error");
        } else {
        if (Precio >= 500)
        {
            Descuento = Precio * .11f;
            PrecioTotal = Precio - Descuento;
            System.out.println("El precio total es: " + PrecioTotal);
        } else {
            Descuento = Precio * .03f;
            PrecioTotal = Precio - Descuento;
            System.out.println("El precio total es: " + PrecioTotal);
        }
        }
    }
}