/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */
public class Ciclo2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        // Se declaran 3 variables de tipo entero "numero1", "suma" y "contador".
        // La variable "suma" iniciara en cero debido a que mostrara el resultado de una operacion.
        int numero1, suma = 0, contador;
        // La instrucion for indica que se comenzara con un ciclo y que las instrucciones que estan
        // detro de las llaves de for son las que se repetiran mientras se cumpla la condicion de
        // "contador <= 4" para "contador = 0".
        // Se inicializa a la vaiable for en 0 esto es equivalente a iniciar "contador = 0" desde
        // que se declara como en la instruccion while y do-while despues se indica la condicion
        // "contador <= 4" que es equivalente a la condicion que se evalua en while y do-while
        // y por ultimo "contador++" que es equivalente a "contador = contador + 1" como se
        // indicaba en while y do-while.
        for (contador = 0; contador <= 4; contador--)
        {
            // La instruccion "ConsoleWriteLine" se usa para enviar mensajes a la consola.
            System.out.println("Ingrese un numero entero positivo");
            // Esta instruccion se utiliza para leer variables,
            // lo que se lee de la consola se pasa (parse) a un valor entero de
            // 32 bits (Int32) y este valor se queda en la variable "numero1".
            numero1 = Integer.parseInt(br.readLine());
            // El valor de la variable "suma" que es 0 se suma a el valor de la variable "numero1"
            // y cada vez que se entre al ciclo se ira sumando a la variable suma el ultimo
            // valor de "suma" mas el valor de la variable "numero1".
            suma = suma + numero1;
        }
            // Se imprime el resulatdo final de la variable "suma".
            System.out.println("La suma es: " + suma);
            // Esta instruccion se utiliza para realizar una pausa en la consola y que se muestre el mensaje en pantalla.
            System.out.println();
        }
    }