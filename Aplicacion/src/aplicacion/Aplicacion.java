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
 * @author Eduardo
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        ArrayList <String> names = new ArrayList <String>();
        
        names.add("Javier");
        names.add("Martin");
        names.add("Marisol");
        names.add("Carla");
        names.add("Hugo");
        names.add("Victor");
        names.add("Elisabeth");
        names.add("Teresa");
        
        System.out.println("Bienvenido");
        System.out.println("Esta es la lista de alumnos disponibles");
        
        for (int i = 0; i < names.size(); i++){
            System.out.print(names.get(i) + "|");
        }
        
        System.out.println("¿Desea agregar a alguien mas?");
        System.out.println("true = si, false = no");
        
        boolean alumno = leer.nextBoolean();
        
        if (alumno == true){
            while (alumno == true){
                System.out.println("Ingrese nombre");
                String nombre = leer.next();
                names.add(nombre);
                System.out.println(names);
                System.out.println("¿Desea agregar a alguien mas?");
                System.out.println("true = si, false = no");
        
                alumno = leer.nextBoolean();
                
                if (alumno == false){
                    System.out.println("El programa se cerrara");
                }
        }
        }else{
            System.out.println("El programa se cerrara");
        }
    }    
}