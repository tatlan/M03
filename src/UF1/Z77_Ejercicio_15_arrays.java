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
public class Z77_Ejercicio_15_arrays {

    public static void main(String[] args) {
        int[] v = new int[5];
        int[] w = new int[5];
        int[] x = new int[10];
        int i;
        int j=0;
        int k=1;

        Random aleatorio = new Random();

        for (i = 0; i < v.length; i++) {
            v[i] = aleatorio.nextInt(10);
            w[i] = aleatorio.nextInt(10);
            x[j]=v[i];
            j=j+2;
            x[k]=w[i];
            k=k+2;
        }
  
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println("");
        for (i = 0; i < w.length; i++) {
            System.out.print(w[i] + " ");
        }

        System.out.println("");
        for (i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
