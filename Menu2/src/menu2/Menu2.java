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
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        
        int opc;
        float base, altura, area, pi = 3.1416f, radio;
        
        System.out.println("1 - Calcular área del cuadrado");
        System.out.println("2 - Calcular área del circulo");
        System.out.println("3 - Calcular área del triangulo");
        System.out.println("Elige una opción");
        opc = Integer.parseInt(br.readLine());
        
        switch (opc) {
        case 1:
            System.out.println("¿Cuánto es la base?");
            base = Float.parseFloat(br.readLine());
            System.out.println("¿Cuánto es la altura?");
            altura = Float.parseFloat(br.readLine());
            area = base * altura;
            System.out.println("El área del cuadrado es: " + area);
        break;
        
        case 2:
            System.out.println("¿Cuánto es el radio?");
            radio = Float.parseFloat(br.readLine());
            area = pi * (radio * radio);
            System.out.println("El área de circulo es: " + area);
        break;
        
        case 3:
            System.out.println("¿Cuánto es la base?");
            base = Float.parseFloat(br.readLine());
            System.out.println("¿Cuánto es la altura?");
            altura = Float.parseFloat(br.readLine());
            area = base * altura;
            System.out.println("El área del triangulo es: " + area);
        break;

        default:
        System.out.println("Opción invalida");

        break;
        }
    }
}