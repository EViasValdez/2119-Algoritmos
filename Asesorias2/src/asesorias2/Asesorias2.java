/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asesorias2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Biblioteca digital
 */
public class Asesorias2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);    

        float precio, descuento = 0, preciototal = 0;     
        System.out.println("Escribe un precio");
        precio = Float.parseFloat(br.readLine());

            if (precio < 0){
                System.out.println("Error");
            }else{
            if (precio >= 500){
                descuento = precio * .11f;
                preciototal = precio - descuento;
                System.out.println("El precio total es"+preciototal);
            }else{
                descuento = precio * .03f;
                preciototal = precio - descuento;
                System.out.println("El precio total es"+preciototal);
            }         
        }
    }
}