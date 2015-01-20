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
public class Z74_Ejercicio_12_arrays {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] v = new int[5];
        int[] w = new int[5];
        int i;
        int j;

        for (i = 0; i < v.length; i++) {
            v[i] = aleatorio.nextInt(10);
            w[w.length - 1 - i] = v[i];
        }

        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
        for (i = 0; i < v.length; i++) {
            System.out.print(w[i] + " ");
        }
    }
}
