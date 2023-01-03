/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasdeverdad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EViasValdez
 */
public class TablasdeVerdad {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    /*
        1. Una casa cuenta con sensores de fuego en las habitaciones,
        estos sensores de fuego en las habitaciones se activaran de acuerdo a las siguientes condiciones.
        A) Si ocurre un incendio.
        B) Si hay humo.
        C) En caso contrario no se encienden.

        2. El cliente tendrá acceso a una caja fuerte de valores.
        A) Conocer la combinación de 4 dígitos.

        3. El cliente de un banco requiere retirar dinero de un cajero automático.
        A) Conocer los 4 dígitos de su tarjeta.
        B) Tener los datos del cliente (Código 16 dígitos, otros 4 dígitos).
    */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here  
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        boolean Ventana1, Ventana2, Puerta, Fuego, Humo, Digito1, Digito2, Digito3, Digito4, Digit1, Digit2, Digit3, Digit4;
        int Opcion;

        System.out.println("Elige una opcion");
        System.out.println("1. Problema examen");
        System.out.println("2. Problema sensores");
        System.out.println("3. Problema caja fuerte");
        System.out.println("4. Problema cajero automatico");
        
        Opcion = Integer.parseInt(br.readLine());

        switch (Opcion) {
        case 1:
            System.out.println("Estado de la ventana 1");
            Ventana1 = Boolean.parseBoolean(br.readLine());
            System.out.println("Estado de la ventana 2");
            Ventana2 = Boolean.parseBoolean(br.readLine());
            System.out.println("Estado de la puerta");
            Puerta = Boolean.parseBoolean(br.readLine());
            
            if (Ventana1 == true || Ventana2 == true || Puerta == true) {
                System.out.println("La alarma se activa");
            }else{
                System.out.println("La alarma no se activa");
            }
        break;
        case 2:
            System.out.println("Sensores de fuego");
            Fuego = Boolean.parseBoolean(br.readLine());
            Humo = Boolean.parseBoolean(br.readLine());
            
            if (Fuego == true || Humo == true) {
                System.out.println("Los sensores se activan");
            }else{
                System.out.println("Los sensores no se activan");
            }
        break;

        case 3:
            System.out.println("Primer dígito");
            Digito1 = Boolean.parseBoolean(br.readLine());
            System.out.println("Segundo digito");
            Digito2 = Boolean.parseBoolean(br.readLine());
            System.out.println("Tercer digito");
            Digito3 = Boolean.parseBoolean(br.readLine());
            System.out.println("Cuarto digito");
            Digito4 = Boolean.parseBoolean(br.readLine());

            if (Digito1 == true || Digito2 == true || Digito3 == true || Digito3 == true) {
                System.out.println("La caja se abre");
            }else{
                System.out.println("La caja no se abre");
            }
        break;

        case 4:
            System.out.println("Primer digito");
            Digit1 = Boolean.parseBoolean(br.readLine());
            System.out.println("Segundo digito");
            Digit2 = Boolean.parseBoolean(br.readLine());
            System.out.println("Tercer digito");
            Digit3 = Boolean.parseBoolean(br.readLine());
            System.out.println("Cuarto digito");
            Digit4 = Boolean.parseBoolean(br.readLine());

            if (Digit1 == true || Digit2 == true || Digit3 == true) {
                System.out.println("Puede retirar el dinero");
            }else{
                System.out.println("No puede retirar el dinero");
        break;
      }
    }
  }
}