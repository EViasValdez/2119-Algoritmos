/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosarray2;

import java.util.ArrayList;

/**
 *
 * @author EViasValdez
 */
public class EjemplosArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> listaNombres = new ArrayList<String>();
        
        for (int i = 0; i < 1000; i++) {
            listaNombres.add (getName(String.valueOf(i)));
        }
        for (int i = 0; i < listaNombres.size(); i++) {
            System.out.println(listaNombres.get(i));
        }
    }
    public static String getName (String i) {
        String nombre = "Eduardo: " + i;
        return nombre;
   }
}