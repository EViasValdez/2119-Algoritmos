/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author EViasValdez
 */
 
public class Aplicacion {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Leer = new Scanner(System.in);
        
        ArrayList <String> Names = new ArrayList <String>();

        Names.add("Javier");
        Names.add("Martin");
        Names.add("Marisol");
        Names.add("Carla");
        Names.add("Hugo");
        Names.add("Victor");
        Names.add("Elisabeth");
        Names.add("Teresa");

        System.out.println("Bienvenido");
        System.out.println("Esta es la lista de alumnos disponibles");

        for (int i = 0; i < Names.size(); i++) {
            System.out.print(Names.get(i) + " | ");
        }
        
        System.out.println("");
        System.out.println("¿Desea agregar a alguien mas?");
        System.out.println("true = Si / false = No");
        
        boolean Alumno = Leer.nextBoolean();
        
        if (Alumno == true) {
            while (Alumno == true) {
                System.out.println("Ingrese Nombre");

                String Nombre = Leer.next();
                Names.add(Nombre);

                System.out.println(Names);
                System.out.println("¿Desea agregar a alguien mas?");
                System.out.println("true = Si / false = No");

                Alumno = Leer.nextBoolean();

                if (Alumno == false) {
                    System.out.println("El programa se cerrara");
                }
            }
        } else {
            System.out.println("El programa se cerrara");
        }
    }
}