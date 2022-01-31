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
 * @author ALUMNOS
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
        
        float suma, numero1, numero2;
        System.out.println("Escribe el primer numero");
        numero1 = Float.parseFloat(br.readLine());
        System.out.println("Escribe el segundo numero");
        numero2 = Float.parseFloat(br.readLine());
        // suma = numero1 + numero2;
        // System.out.println("La suma es" + suma(numero1,numero2));
        System.out.println("La suma es" + suma(numero1,numero2));
        System.out.println("La resta es" + resta(numero1,numero2));
        System.out.println("La mutliplicacion es" + resta(numero1,numero2));
        System.out.println("La disvision es" + resta(numero1,numero2));
    }
    private static float suma(float numero1, float numero2) {
        float suma=0;
        suma = numero1 + numero2;
        return suma;      
    }
    private static float resta(float numero1, float numero2) {
        float resta=0;
        resta = numero1 - numero2;
        return resta;      
    }
    private static float multiplicacion(float numero1, float numero2) {
        float multiplicacion=0;
        multiplicacion = numero1 * numero2;
        return multiplicacion;      
    }
    private static float division(float numero1, float numero2) {
        float division=0;
        division = numero1 / numero2;
        return division;      
    }
}