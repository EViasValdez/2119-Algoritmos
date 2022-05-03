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
 * @author ALUMNOS
 */
public class Tablasdeverdad {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    /*
        1. UNA CASA CUENTA CON SENSORES DE FUEGO EN LAS HABITACIONES, ESTOS SENSORES DE FUEGO EN LAS HABITACIONES
        ESTOS SENSORES SE ACTIVARAN DE ACUERDO A LAS SIGUIENTES CONDICIONES.
        A) SI OCURRE UN INCENDIO.
        B) SI HAY HUMO.
        C) EN CASO CONTRARIO NO SE ENCIENDEN.

        2. EL CLIENTE TENDRA ACCESO A UNA CAJA FUERTE DE VALORES.
        A) CONOCER LA COMBINACION DE 4 DIGITOS.

        3. EL CLIENTE DE UN BANCO REQUIERE RETIRAR DINERO DE UN CAJERO AUTOMATICO.
        A) CONOCER LOS 4 DIGITOS DE SU TARJETA.
        B) TENER LOS DATOS DEL CLIENTE (CODIGO 16 DIGITOS, OTROS 4 DIGITOS).
    */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here  
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        boolean ventana1, ventana2, puerta, fuego, humo, digito1, digito2, digito3, digito4, digit1, digit2, digit3, digit4;
        int opcion;

        System.out.println("Elige una opcion");
        System.out.println("1. Problema examen");
        System.out.println("2. Problema sensores");
        System.out.println("3. Problema caja fuerte");
        System.out.println("4. Problema cajero automatico");
        
        opcion = Integer.parseInt(br.readLine());

        switch (opcion){
        case 1:
            System.out.println("Estado de la ventana 1");
            ventana1 = Boolean.parseBoolean(br.readLine());
            System.out.println("Estado de la ventana 2");
            ventana2 = Boolean.parseBoolean(br.readLine());
            System.out.println("Estado de la puerta");
            puerta = Boolean.parseBoolean(br.readLine());
            
            if (ventana1 == true || ventana2 == true || puerta == true){
                System.out.println("La alarma se activa");
            }else{
                System.out.println("La alarma no se activa");
            }
        break;
        case 2:
            System.out.println("Sensores de fuego");
            fuego = Boolean.parseBoolean(br.readLine());
            humo = Boolean.parseBoolean(br.readLine());
            if (fuego == true || humo == true){
                System.out.println("Los sensores se activan");
            }else{
                System.out.println("Los sensores no se activan");
            }
        break;

        case 3:
            System.out.println("Primer digito");
            digito1 = Boolean.parseBoolean(br.readLine());
            System.out.println("Segundo digito");
            digito2 = Boolean.parseBoolean(br.readLine());
            System.out.println("Tercer digito");
            digito3 = Boolean.parseBoolean(br.readLine());
            System.out.println("Cuarto digito");
            digito4 = Boolean.parseBoolean(br.readLine());

            if (digito1 == true || digito2 == true || digito3 == true || digito3 == true){
                System.out.println("La caja se abre");
            }else{
                System.out.println("La caja no se abre");
            }
        break;

        case 4:
            System.out.println("Primer digito");
            digit1 = Boolean.parseBoolean(br.readLine());
            System.out.println("Segundo digito");
            digit2 = Boolean.parseBoolean(br.readLine());
            System.out.println("Tercer digito");
            digit3 = Boolean.parseBoolean(br.readLine());
            System.out.println("Cuarto digito");
            digit4 = Boolean.parseBoolean(br.readLine());

            if (digit1 == true || digit2 == true || digit3 == true){
                System.out.println("Puede retirar el dinero");
            }else{
                System.out.println("No puede retirar el dinero");
        break;
      }
    }
  }
}