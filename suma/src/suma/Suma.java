/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */

public class Suma {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        float Suma, Numero1, Numero2;

        System.out.println("Escribe el primer numero");
        Numero1 = Float.parseFloat(br.readLine());
        System.out.println("Escribe el segundo numero");
        Numero2 = Float.parseFloat(br.readLine());

        // Suma = Numero1 + Numero2;
        // System.out.println("La suma es: " + Suma (Numero1, Numero2));

        System.out.println("La suma es: " + Suma (Numero1, Numero2));
        System.out.println("La resta es: " + Resta (Numero1, Numero2));
        System.out.println("La multiplicacion es: " + Resta (Numero1, Numero2));
        System.out.println("La division es: " + Resta (Numero1, Numero2));
    }
    private static float Suma(float Numero1, float Numero2) {
        float Suma = 0;

        Suma = Numero1 + Numero2;
        return Suma;
    }
    private static float Resta(float Numero1, float Numero2) {
        float Resta = 0;

        Resta = Numero1 - Numero2;
        return Resta;
    }
    private static float Multiplicacion(float Numero1, float Numero2) {
        float Multiplicacion = 0;

        Multiplicacion = Numero1 * Numero2;
        return Multiplicacion;
    }
    private static float Division(float Numero1, float Numero2) {
        float Division = 0;

        Division = Numero1 / Numero2;
        return Division;
    }
}