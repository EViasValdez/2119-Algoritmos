/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosBoleanos1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */
public class DatosBoleanos1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        boolean contacto, ventana1, ventana2, puerta;

        System.out.println("¿Esta encendido el foco?");
        contacto = Boolean.parseBoolean(br.readLine());

        if (contacto == true) {
            System.out.println("El foco esta encendido " + contacto);
        }

        System.out.println("Estado de la puerta");
        puerta = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la ventana 1");
        ventana1 = Boolean.parseBoolean(br.readLine());

        System.out.println("Estado de la ventana 2");
        ventana2 = Boolean.parseBoolean(br.readLine());

        if ((puerta == true)|| (ventana1 == true)|| (ventana2 == true)) {
            System.out.println("El ladron entra");
        }else{
            System.out.println("El ladron no puede entrar");
        }
    }
}