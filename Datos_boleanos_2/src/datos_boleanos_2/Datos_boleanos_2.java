/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos_boleanos_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */
public class Datos_boleanos_2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // Un tanque de agua se llena en base a lo siguiente:
        // 1) La valvula 1 esta abierta.
        // 2) La valvula 2 esta abierta.
        // 3) La valvula 3 esta abierta.
        // 4) La valvula 4 esta abierta.
        // 5) La bomba esta abierta.
        // 6) La energia electrica esta apagada.
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        boolean valvula1, valvula2, valvula3, valvula4, bomba, energiaelectrica;

        System.out.println("Estado de la valvula 1");
        valvula1 = Boolean.parseBoolean(br.readLine());
        
        System.out.println("Estado de la valvula 2");
        valvula2 = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la valvula 3");
        valvula3 = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la valvula 4");
        valvula4 = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la bomba");
        bomba = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la energia electrica");
        energiaelectrica = Boolean.parseBoolean(br.readLine());
        
        if ((valvula1 == true)|| (valvula2 == true)|| (valvula3 == true)|| (valvula4 == true)|| (bomba == true)|| (energiaelectrica == false)){
            System.out.println("Tanque lleno");
        }else{
            System.out.println("Tanque vacio");
        }
    }
}