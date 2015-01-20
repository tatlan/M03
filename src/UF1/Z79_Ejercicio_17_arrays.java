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
public class Z79_Ejercicio_17_arrays {

    public static void main(String[] args) {
        int[] may = new int[5];
        int[] men = new int[5];
        int[] v = new int[5];
        int i;
        int j = 0;
        int k = 0;
        int suma = 0;
        int media;

        Random aleatorio = new Random();
        for (i = 0; i < v.length; i++) {
            v[i] = aleatorio.nextInt(10);
            suma = suma + v[i];
        }
        media = suma / v.length;

        for (i = 0; i < v.length; i++) {
            if (v[i] >= media) {
                may[j] = v[i];
                j++;
            } else {
                men[k] = v[i];
                k++;
            }

        }
        System.out.println("Mayores");
        for (i = 0; i < may.length; i++) {
            System.out.print(may[i] + " ");
        }
        System.out.println("");
        System.out.println("Menores");

        
        for (i = 0; i < men.length; i++) {
            System.out.print(men[i] + " ");
        }
        System.out.println("");
        System.out.println("Vector base");
        
        for (i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");

        }
        System.out.println("");
        System.out.println("suma " + suma);
        System.out.println("media " + media);
    }
}
