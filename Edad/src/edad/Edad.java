/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ALUMNOS
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);
        
        float edad, numeroniños, promedio;
        
        int cuantos;
        System.out.println("¿Cuantos niños?");
        cuantos = Integer.parseInt(br.readLine());
        for (int j = 0; j <= cuantos; j++){
        
        System.out.println("Escribe la edad");
        edad = Float.parseFloat(br.readLine());
        
        System.out.println("Escribe el promedio");
        promedio = Float.parseFloat(br.readLine());
        
        if(edad == 6 || edad >= 8 && edad <= 10 && promedio >=9 && promedio <=10){
        System.out.println("Pordras ingresar al futbol");    
        }else{
        if(edad >= 8 && edad <= 10 || promedio >= 8 && promedio <= 10){
        System.out.println("Podras ingresar al basquetbol");    
        }else{
        if(edad >= 6 && edad <= 10 || promedio == 10){
        System.out.println("Podras ingesas al deporte que quieras");        
        }else{
        if(edad >= 6 && edad <= 10 || promedio == 7){     
        System.out.println("");    
        }
        }
        }
        }
    }
    }
    }


