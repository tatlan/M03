/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1;

import java.util.Random;

/**
 *
 * @author JuanAlfonso
 */
public class Z78_Ejercicio_16_arrays {

    public static void main(String[] args) {
        int[] i = new int[5];
        int[] p = new int[5];
        int[] v = new int[10];
        int j;
        int k = 0;
        int m = 0;

        Random aleatorio = new Random();

        for (j = 0; j < v.length; j++) {
            v[j] = aleatorio.nextInt(10);

            if (j % 2 == 0) {
                i[k] = v[j];
                k = k + 1;
            } else {
                p[m] = v[j];
                m = m + 1;

            }
        }

        for (j = 0; j < i.length; j++) {
            System.out.print(i[j] + " ");
        }

        System.out.println("");
        for (j = 0; j < p.length; j++) {
            System.out.print(p[j] + " ");
        }

        System.out.println("");
        for (j = 0; j < v.length; j++) {
            System.out.print(v[j] + " ");
        }

    }

}
