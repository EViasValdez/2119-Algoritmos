/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Test
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        int aprobaron=0, reprobaron=0, invalida=0;
        float suma = 0, promedio = 0;
        float calificacion [] = new float [5];

        for (int i = 0; i<calificacion.length; i++){
            System.out.println("Escribe la calsificacion");
            calificacion[i]=Float.parseFloat(br.readLine());
            if (calificacion[i]>10 || calificacion[i]<0){
                invalida++;
            }else{
            if (calificacion[i]>=7){
                aprobaron++;
            }else{
            if (calificacion[i]<7){
                reprobaron++;
            }
            }                
            }
        suma = suma + calificacion[i];    
    }
    
        promedio = suma/5;
        System.out.println("El promedio es" + promedio);  
        System.out.println("Alumnos reprobados" + reprobaron);
        System.out.println("Alumnos aprobados" + aprobaron);
        System.out.println("Promedios invalidos" + invalida);
    }
}