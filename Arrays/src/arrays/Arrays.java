/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author EViasValdez
 */

public class Arrays {
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        String [] Objetos = {"Muebles", "Puerta", "Televisor", "Computadora", "Reloj", "Videoconsola", "Refrigerador", "Mesa", "Tetera", "Horno"};
        Boolean [] Datos = {true, false, true, false, true, false, true, false};

        int[] Numeros = {1, 2, 6, 4 ,5 ,6, 8, 10};
        int Num = 0;
        int Numero = 0;

        // float calificaciones;
        // float calificacion;
        // True = Grupo A
        // False = Grupo B
        // 0 = Hombre
        // 1 = Mujer

        System.out.println("Sea bienvenido");
        System.out.println("Asignación de elementos de alumnos");
        for (int x = 0; x < 10; x++)
        {
            Num = Num + 1;
            System.out.println("Alumno" + Num);

            String [] Nombre = null;

            System.out.println("Nombre: " + Nombre[x]);
            if (Datos[x] == true)
            {
                System.out.println("Grupo asignado: A");
            }
            else
            {
                System.out.println("Grupo asignado: B");
            }

            int [] Binarios = null;

            if (Binarios[x] == 1) {
                System.out.println("Genero: Mujer");
            } else {
                System.out.println("Genero: Hombre");
            }
            System.out.println("Materias aprobadas" + Numero);
            System.out.println("");
            // Calificaciones.

            // int Suma = 0;
            // int i;
        }
    }
}