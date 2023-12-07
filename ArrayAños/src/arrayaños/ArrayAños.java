/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayaños;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author EViasValdez
 */
 
public class ArrayAños {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Alea = new Scanner(System.in);

        ArrayList <Integer> Nums = new ArrayList <Integer>();

        int n = 0;

        for (int i = 0; i < n; i++)
        {
            int Num = Alea.nextInt(2019);

            while (Num > 1950)
            {
                if (Num < 1950)
                {
                    break;
                }
                Num = Alea.nextInt(2019);
            }
            Nums.add(Num);
        }
    }
    public static ArrayList <Integer> matricula(int s) {
        String Letras [] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
        return null;
    }
}