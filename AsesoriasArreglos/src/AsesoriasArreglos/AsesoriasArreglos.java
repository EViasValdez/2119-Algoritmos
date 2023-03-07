/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asesoriasarreglos;

import java.util.Scanner;

/**
 *
 * @author EViasValdez
 */
 
public class AsesoriasArreglos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner (System.in);

        String Nombres [] = new String [7];
        String Apellidos [] = new String [5];

        for (int i = 1; i <= 7; i++) {
            System.out.println("Escribe el nombre");
            Nombres [i] = Leer.next();
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Escribe el apellido");
            Apellidos [i] = Leer.next();
        }

        String Nombre = "Alicia";
        String Apellido = "Flores";

        for (int i = 1; i < 7; i++) {
            if (Nombre.equals(Nombres [i])) {
                System.out.println("Si esta");
            }else{
                System.out.println("No esta");
            }
        }
        for (int i = 1; i < 5; i++) {
            if (Apellido.equals(Apellidos [i])) {
                System.out.println("Si existe");
            }else{
                System.out.println("No existe");
            }
        }
    }
}