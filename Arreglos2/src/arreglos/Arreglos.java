/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        String [] Semana = {"Lunes","Martes"};
        char [] Letras = {'L','M'};

        String [] Meses = new String [12];
        char [] Letras2 = new char [7];

        int nElementos;

        System.out.println("Numero de elementos del arreglo");
        nElementos = leer.nextInt();
        int [] m = new int [nElementos];
        int k = 0;

        System.out.println("Ingresa los valores del arreglo");
        for (k = 0; k < nElementos; k++)
        {
            System.out.print("m[" + k + "] = ");
            m [k] = leer.nextInt();
        }
        System.out.println();

        for (k = 0; k < nElementos; k++)
        {
            System.out.println(m [k] + " ");
        }

        ArrayList <Float> notas = new ArrayList<>(); // La Clase ArrayList se utiliza para crear arreglos unidimensionales.
        // En este caso se creo un arreglo llamado "notas de tipo float" y no se especifico el tamaño del mismo.
        int l = 0;
        System.out.println("Introducir calificaiones, finalizar con -1");
        System.out.printf("Alumnno numero %3d, calificaion media:", ++l);
        float calif = leer.nextFloat();
        while (calif != -1)
        {
            notas.add(calif); // El metodo add se utiliza para ir agregando datos al arreglo.
            System.out.printf("Alumno numero %3d, nota media: " , ++l); // "printf" muestra un mensaje en pantalla
            // en el cual se especifica el formato de los datos con %d para datos de tipo entero.
            calif = leer.nextFloat();
        }

        int nalumnos = notas.size(); // El metodo size obtiene el tamaño del arreglo.
        float suma = 0;
        for (l = 0; l < nalumnos; l++)
        {
            suma += notas.get(l); // El metodo get obtiene un elemento del arreglo en este
            // caso obtiene el dato de la posicion 1 del arreglo.
            System.out.println();
            System.out.printf("Nota media del curso: %5.2f" , suma / nalumnos);
        }

        int car;
        for (int i = 0; i <= 11; i++)
        {
            System.out.println("Mes de tu nacimiento");
            Meses [i] = leer.next();     
        }
        for (int i = 0; i <= 11; i++)
        {
            System.out.println("Los meses son: " + Meses [i]);
          // Meses [i] = leer.next();
        }
        for (int j = 0; j <= 6; j++)
        {
            System.out.println("Dias de la semana");
            car = System.in.read(); // Lee un arreglo de caracteres.
            System.in.read(); // Lee una linea en blanco.
            Letras2 [j] = (char) car; // Se asigna lo que vaya leyedo en la variable car a el arreglo "Letras2".
            // Letras2 [i] = (char) leer.toString();
            // (int) variable.charAt(1);
        }
        for (int j = 0; j <= 6; j++)
        {
            System.out.println("Los meses son: " + Letras2 [j]);
          //  Meses [i] = leer.next();
        }

        // int [] numeros = new int [10];
        // int [] numeros = {1,2,3,4,5,6,7,8,9,10};
        //
        // int valor = numeros [2];
        // System.out.println(numeros [2]);
        // System.out.println(valor);
        System.out.println(Semana [1]);
        // for (int i = 0; i <= 9; i++)
        System.out.println(Letras [1]);
        // {
        //     int valor = numeros [2];
        //     System.out.println("26");
        //     System.out.println(numeros [i]);
        //     System.out.println(" ");
        //     System.out.println(" ");
        // }
    }
}