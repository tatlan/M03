/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z71_Ejercicio_9_arrays {

    public static void main(String[] args) {

        int[] vector = new int[10];
        Scanner darnumero = new Scanner(System.in);
        int i;

        for (i = 0; i < vector.length; i++) {
            System.out.println("Dime un numero");
            vector[i] = darnumero.nextInt();
        }

        for (i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

        for (i = 0; i < vector.length; i = i + 2) {
            System.out.println(vector[i] + vector[i + 1]);
        }

    }

}
