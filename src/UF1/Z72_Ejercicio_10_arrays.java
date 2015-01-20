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
public class Z72_Ejercicio_10_arrays {

    public static void main(String[] args) {

        int[] vector = new int[5];
        Scanner darnumero = new Scanner(System.in);
        int i;
        int j;
        int k = 2;
        int parcial = 0;

        for (i = 0; i < vector.length; i++) {
            System.out.println("Dime un numero");
            vector[i] = darnumero.nextInt();
        }

        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
        }
        System.out.println("");
        for (i = 0; i < vector.length - 1; i++) {
            for (j = 0; j < k; j++) {
                parcial = parcial + vector[j];
            }

            System.out.println(parcial);
            parcial = 0;
            k = k + 1;
        }

    }

}
