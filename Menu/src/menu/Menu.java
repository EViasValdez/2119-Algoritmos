/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ALUMNOS
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        float n1, n2, suma = 0, resta = 0, multiplicacion = 0, division = 0;
        int opc;

        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Division");
        System.out.println("Elige una opcion");
        opc = Integer.parseInt(br.readLine());
        switch(opc){
        case 1:
        System.out.println("Escribe el primer numero");
        n1 = Float.parseFloat(br.readLine());
        System.out.println("Escriba el segundo numero");
        n2 = Float.parseFloat(br.readLine());
        suma = n1 + n2;
        System.out.println("La suma es:" + suma);
        break;

        case 2:
        System.out.println("Escribe el primer numero");
        n1 = Float.parseFloat(br.readLine());
        System.out.println("Escribe el segundo numero");
        n2 = Float.parseFloat(br.readLine());
        resta = n1 - n2;
        System.out.println("La resta es:" + resta);
        break;

        case 3:
        System.out.println("Escribe el primer numero");
        n1 = Float.parseFloat(br.readLine());
        System.out.println("Escribe el segundo numero");
        n2 = Float.parseFloat(br.readLine());
        multiplicacion = n1 * n2;
        System.out.println("La multiplicacion es" + multiplicacion);
        break;

        case 4:
        System.out.println("Escribe el primer numero");
        n1 = Float.parseFloat(br.readLine());
        System.out.println("Escribe el segundo numero");
        n2 = Float.parseFloat(br.readLine());
        division = n1 / n2;
        System.out.println("La division es" + division);
        break;

        default:
        System.out.println("Opcion no valida");
        break;
        }
    }
}