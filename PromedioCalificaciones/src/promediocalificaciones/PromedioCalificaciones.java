/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promediocalificaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */
public class PromedioCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        float Calificacion, Promedio, Porcentaje, Pagototal, Mensualidad = 2000, Suma = 0;
        int Cuantos;

        System.out.println("¿Cuantos alumnos?");
        Cuantos = Integer.parseInt(br.readLine());

        for (int j = 0; j <= Cuantos; j++) {
            for (int i = 0; i <= 3; i++) {
                System.out.println("Calificacion");
                
                Calificacion = Float.parseFloat(br.readLine());
                Suma = Suma + Calificacion;
            }
            
            Promedio = Suma / 4;
            System.out.println("El promedio es: " + Promedio);

            if (Promedio >= 6 && Promedio <= 7) {
                Pagototal = Mensualidad - (Mensualidad * .10f);
                System.out.println("El pago total es: " + Pagototal);
            } else {
            if (Promedio >= 7 && Promedio <= 8) {
                Pagototal = Mensualidad - (Mensualidad * .10f);
                System.out.println("El pago total es: " + Pagototal);
            } else {
            if (Promedio >= 8 && Promedio <= 9) {
                Pagototal = Mensualidad - (Mensualidad * .10f);
                System.out.println("El pago total es: " + Pagototal);
            } else {
            if (Promedio >= 9 && Promedio <= 10) {
                Pagototal = Mensualidad - (Mensualidad * .10f);
                System.out.println("El pago total es: " + Pagototal);
            }
            }
            }
            }
        }
    }
}