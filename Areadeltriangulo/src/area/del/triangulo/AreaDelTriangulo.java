/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.del.triangulo;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS
 */
public class AreaDelTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresar base");
        
        int n1= leer.nextInt();
        System.out.println("Ingresar altura");
        
        int n2= leer.nextInt();
      int r;
      r= (n1*n2)/2;
              System.out.println("El resultado del area es"+r);
        // TODO code application logic here
    }
    
}