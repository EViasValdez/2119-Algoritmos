/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aesoriasarreglos;

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
        Scanner leer = new Scanner (System.in);

        String nombres [] = new String [7];
        String apellidos [] = new String [5];

        for (int i = 1; i <= 7; i++) {
            System.out.println("Escribe el nombre");
            nombres [i] = leer.next();
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Escribe el apellido");
            apellidos [i] = leer.next();
        }

        String nombre = "Alicia";
        String apellido = "Flores";

        for (int i = 1; i < 7; i++) {
            if (nombre.equals(nombres [i])) {
                System.out.println("Si esta");
            }else{
                System.out.println("No esta");
            }
        }
        for (int i = 1; i < 5; i++) {
            if (apellido.equals(apellidos [i])) {
                System.out.println("Si existe");
            }else{
                System.out.println("No existe");
            }
        }
    }
}