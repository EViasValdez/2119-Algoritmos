/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        float Edad, Numeroniños, Promedio;

        int Cuantos;

        System.out.println("¿Cuantos niños son?");
        Cuantos = Integer.parseInt(br.readLine());

        for (int j = 0; j <= Cuantos; j++) {
            System.out.println("Escribe la edad");
            Edad = Float.parseFloat(br.readLine());
            
            System.out.println("Escribe el promedio");
            Promedio = Float.parseFloat(br.readLine());

            if (Edad == 6 || Edad >= 8 && Edad <= 10 && Promedio >= 9 && Promedio <= 10) {
                System.out.println("Puedes ingresar al futbol");
            }else{
            if (Edad >= 8 && Edad <= 10 || Promedio >= 8 && Promedio <= 10) {
                System.out.println("Puedes ingresar al basquetbol");
            }else{
            if (Edad >= 6 && Edad <= 10 || Promedio == 10) {
                System.out.println("Puedes ingresar al deporte que quieras");
            }else{
            if (Edad >= 6 && Edad <= 10 || Promedio == 7) {
                System.out.println("");
            }
            }
            }
            }
        }
    }
}