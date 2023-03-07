/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asesorias1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */

public class Asesorias1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        float Salario, TotalSalario = 0;
        String Nombre;
        int Categoria;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Escribe el nombre");
            Nombre = br.readLine();
            System.out.println("Escribe el salario");
            Salario = Float.parseFloat(br.readLine());
            System.out.println("Escribe la categoria");
            Categoria = Integer.parseInt(br.readLine());

            switch (Categoria) {
            case 1:
                TotalSalario = Salario * 15;
                System.out.println("El total del salario es: " + TotalSalario);
            break;

            case 2:
                TotalSalario = Salario * 0.10f;
                System.out.println("El total del salario es: " + TotalSalario);
            break;

            case 3:
                TotalSalario = Salario;
            break;

            }
        }
    }
}