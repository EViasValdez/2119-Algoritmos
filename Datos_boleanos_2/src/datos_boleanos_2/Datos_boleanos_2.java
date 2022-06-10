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
        // 1) La válvula 1 esta abierta.
        // 2) La válvula 2 esta abierta.
        // 3) La válvula 3 esta abierta.
        // 4) La válvula 4 esta abierta.
        // 5) La bomba esta abierta.
        // 6) La energía eléctrica esta apagada.
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        boolean valvula1, valvula2, valvula3, valvula4, bomba, energiaelectrica;

        System.out.println("Estado de la válvula 1");
        valvula1 = Boolean.parseBoolean(br.readLine());
        
        System.out.println("Estado de la válvula 2");
        valvula2 = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la válvula 3");
        valvula3 = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la válvula 4");
        valvula4 = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la bomba");
        bomba = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la energía eléctrica");
        energiaelectrica = Boolean.parseBoolean(br.readLine());
        
        if ((valvula1 == true)|| (valvula2 == true)|| (valvula3 == true)|| (valvula4 == true)|| (bomba == true)|| (energiaelectrica == false)){
            System.out.println("Tanque lleno");
        }else{
            System.out.println("Tanque vació");
        }
    }
}