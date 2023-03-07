/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */

public class Ciclo {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        // Se declaran 3 variables de tipo entero "numero1", "suma" y "contador".
        // La variable "suma" iniciara en cero debido a que mostrara el resultado de una operación.
        int Numero1, Suma = 0, Contador;
        // La instrucción for indica que se comenzara con un ciclo y que las instrucciones que están
        // dentro de las llaves de for son las que se repetirán mientras se cumpla la condición de
        // "contador <= 4" para "contador = 0".
        // Se inicializa a la variable for en 0 esto es equivalente a iniciar "contador = 0" desde
        // que se declara como en la instrucción while y do-while después se indica la condición
        // "contador <= 4" que es equivalente a la condición que se evalúa en while y do-while
        // y por ultimo "contador++" que es equivalente a "contador = contador + 1" como se
        // indicaba en while y do-while.
        for (Contador = 0; Contador <= 4; Contador--)
        {
            // La instrucción "Console.WriteLine" se usa para enviar mensajes a la consola.
            System.out.println("Ingrese un numero entero positivo");
            // Esta instrucción se utiliza para leer variables,
            // lo que se lee de la consola se pasa (parse) a un valor entero de
            // 32 bits (Int32) y este valor se queda en la variable "numero1".
            Numero1 = Integer.parseInt(br.readLine());
            // El valor de la variable "suma" que es 0 se suma a el valor de la variable "numero1"
            // y cada vez que se entre al ciclo se ira sumando a la variable suma el ultimo
            // valor de "suma" mas el valor de la variable "numero1".
            Suma = Suma + Numero1;
        }
            // Se imprime el resultado final de la variable "suma".
            System.out.println("La suma es: " + Suma);
            // Esta instrucción se utiliza para realizar una pausa en la consola 
            // y que se muestre el mensaje en pantalla.
            System.out.println();
        }
    }