/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosBoleanos2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */

public class DatosBoleanos2 {
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
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        boolean Valvula1, Valvula2, Valvula3, Valvula4, Bomba, EnergiaElectrica;

        System.out.println("Estado de la valvula 1");
        Valvula1 = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la valvula 2");
        Valvula2 = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la valvula 3");
        Valvula3 = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la valvula 4");
        Valvula4 = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la bomba");
        Bomba = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la energia eléctrica");
        EnergiaElectrica = Boolean.parseBoolean(br.readLine());

        if ((Valvula1 == true)|| (Valvula2 == true)|| (Valvula3 == true)|| (Valvula4 == true)|| (Bomba == true)|| (EnergiaElectrica == false)) {
            System.out.println("Tanque lleno");
        }else{
            System.out.println("Tanque vació");
        }
    }
}