/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */

public class Ciclos {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        int Aprobaron = 0, Reprobaron = 0, Invalida = 0;
        float Suma = 0, Promedio = 0;
        float Calificacion [] = new float [5];

        for (int i = 0; i < Calificacion.length; i++) {
            System.out.println("Escribe la calificación");
            Calificacion[i] = Float.parseFloat(br.readLine());

            if (Calificacion[i] > 10 || Calificacion[i] < 0) {
                Invalida++;
            } else {
            if (Calificacion[i] >= 7) {
                Aprobaron++;
            } else {
            if (Calificacion[i] < 7) {
                Reprobaron++;
            }
            }
            }
            Suma = Suma + Calificacion[i];
        }

        Promedio = Suma / 5;
        System.out.println("El promedio es: " + Promedio);
        System.out.println("Alumnos reprobados: " + Reprobaron);
        System.out.println("Alumnos aprobados: " + Aprobaron);
        System.out.println("Promedios invalidos: " + Invalida);
    }
}