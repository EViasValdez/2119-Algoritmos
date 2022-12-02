/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */
public class Arreglos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        float Precios [] = new float [10];
        float Suma = 0, promedio = 0;

        for (int x = 0; x < 10; x++) {
            System.out.println("Escribe el precio");
            Precios [x] = Float.parseFloat(br.readLine());
        }
        for (int x = 0; x < 10; x++) {
            System.out.println("Los precios son: " + Precios [x]);
        }
        for (int x = 0; x < 10; x++) {
            Suma = Suma + precios [x];
        }
        Promedio = Suma / 10;

        System.out.println("El total de los precios es: " + Suma);
        System.out.println("El promedio de los precios es: "  + Promedio);

        for (int x = 0; x < 10; x++) {
            if (Precios [x] >= 5000) {
                System.out.println("El precio es muy alto");
            }else{
                System.out.println("El precio es muy bajo");
            }
        }
        for (int x = 0; x < 10; x++) {
            if (Precios [x] < 0) {
                System.out.println("No puede haber precios negativos");
            }else{
            if (Precios [x] == 0) {
                System.out.println("El precio debe ser mayor que 0");
            }
            }
        }

        float Mayor = Precios [0];

        for (int x = 0; x < 10; x++) {
            if (Precios [x] > Mayor) {
                Mayor = Precios [x];
            }
        }
        System.out.println("El mayor es: " + Mayor);
        
        float Menor = Precios [0];

        for (int x = 0; x < 10; x++) {
            if (Precios [x] < Menor) {
                Menor = Precios [x];
            }
        }
        System.out.println("El menor es: " + Menor);
    }
}