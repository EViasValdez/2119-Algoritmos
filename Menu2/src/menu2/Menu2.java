/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */

public class Menu2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int Opc;
        float Base, Altura, Area, Pi = 3.1416f, Radio;

        System.out.println("1 - Calcular area del cuadrado");
        System.out.println("2 - Calcular area del circulo");
        System.out.println("3 - Calcular area del triangulo");
        System.out.println("Elige una opción");
        Opc = Integer.parseInt(br.readLine());

        switch (Opc) {
        case 1:
            System.out.println("¿Cuánto es la base?");
            Base = Float.parseFloat(br.readLine());
            System.out.println("¿Cuánto es la altura?");
            Altura = Float.parseFloat(br.readLine());
            Area = Base * Altura;
            System.out.println("El area del cuadrado es: " + Area);
        break;

        case 2:
            System.out.println("¿Cuánto es el radio?");
            Radio = Float.parseFloat(br.readLine());
            Area = Pi * (Radio * Radio);
            System.out.println("El area de circulo es: " + Area);
        break;

        case 3:
            System.out.println("¿Cuánto es la base?");
            Base = Float.parseFloat(br.readLine());
            System.out.println("¿Cuánto es la altura?");
            Altura = Float.parseFloat(br.readLine());
            Area = Base * Altura;
            System.out.println("El area del triangulo es: " + Area);
        break;

        default:
        System.out.println("Opción invalida");

        break;
        }
    }
}