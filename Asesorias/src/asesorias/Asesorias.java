/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asesorias;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */
public class Asesorias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        float salario, totalsalario = 0;
        String nombre;
        int categoria;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Escribe el nombre");
            nombre = br.readLine();
            System.out.println("Escribe el salario");
            salario = Float.parseFloat(br.readLine());
            System.out.println("Escribe la categoría");
            categoria = Integer.parseInt(br.readLine());

            switch (categoria) {
            case 1:
                totalsalario = salario * 15;
                System.out.println("El total del salario es: " + totalsalario);
            break;

            case 2:
                totalsalario = salario * 0.10f;
                System.out.println("El total del salario es: " + totalsalario);
            break;

            case 3:
                totalsalario = salario;
            break;

            }
        }
    }
}