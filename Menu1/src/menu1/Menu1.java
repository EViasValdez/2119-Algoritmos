/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */

public class Menu1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        float N1, N2, Suma = 0, Resta = 0, Multiplicacion = 0, Division = 0;
        int Opc;

        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicacion");
        System.out.println("4 - Division");
        System.out.println("Elige una opcion");
        Opc = Integer.parseInt(br.readLine());

        switch (Opc) {
        case 1:
            System.out.println("Escribe el primer numero");
            N1 = Float.parseFloat(br.readLine());
            System.out.println("Escriba el segundo numero");
            N2 = Float.parseFloat(br.readLine());
            Suma = N1 + N2;
            System.out.println("La suma es: " + Suma);
        break;

        case 2:
            System.out.println("Escribe el primer numero");
            N1 = Float.parseFloat(br.readLine());
            System.out.println("Escribe el segundo numero");
            N2 = Float.parseFloat(br.readLine());
            Resta = N1 - N2;
            System.out.println("La resta es: " + Resta);
        break;

        case 3:
            System.out.println("Escribe el primer numero");
            N1 = Float.parseFloat(br.readLine());
            System.out.println("Escribe el segundo numero");
            N2 = Float.parseFloat(br.readLine());
            Multiplicacion = N1 * N2;
            System.out.println("La multiplicacion es: " + Multiplicacion);
        break;

        case 4:
            System.out.println("Escribe el primer numero");
            N1 = Float.parseFloat(br.readLine());
            System.out.println("Escribe el segundo numero");
            N2 = Float.parseFloat(br.readLine());
            Division = N1 / N2;
            System.out.println("La division es: " + Division);
        break;

        default:
            System.out.println("Opcion no valida");
        break;

        }
    }
}