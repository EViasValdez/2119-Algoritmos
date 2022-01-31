/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promediocalificaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ALUMNOS
 */
public class PromedioCalificaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader(isr);
        
        float calificacion, promedio, porcentaje, pagototal, mensualidad =2000, suma = 0;
        int cuantos;

        System.out.println("¿Cuantos alumnos?");
        cuantos = Integer.parseInt(br.readLine());
        for (int j = 0; j <= cuantos; j++){
            for(int i = 0; i<=3; i++){
                System.out.println("Calificacion"); 
                calificacion = Float.parseFloat(br.readLine());
                suma = suma + calificacion;
            }
            promedio = suma / 4;    
            System.out.println("Promedio es"+promedio);
        
                if(promedio >= 6 && promedio <= 7){
                    pagototal = mensualidad - (mensualidad * .10f);
                    System.out.println("El pago total es"+pagototal);
                }else{
                if(promedio >= 7 && promedio <= 8){
                    pagototal = mensualidad - (mensualidad * .10f);
                    System.out.println("El pago total es"+pagototal); 
                }else{
                if(promedio >= 8 && promedio <= 9){
                    pagototal = mensualidad - (mensualidad * .10f);
                    System.out.println("El pago total es"+pagototal);        
                }else{
                if(promedio >= 9 && promedio <= 10){
                    pagototal = mensualidad - (mensualidad * .10f);
                    System.out.println("El pago total es"+pagototal);
                    }
                    }        
                    }
                    }
            }
    }
}