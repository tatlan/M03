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
public class Z76_Ejercicio_14_arrays {

    public static void main(String[] args) {
        int[] v = new int[10];
        int i = 0;
        int auxiliar;
        int contador = 0;

        System.out.println("Dime un numero");
        Scanner darnumero = new Scanner(System.in);
        auxiliar = darnumero.nextInt();

        while (auxiliar > 0 && i < v.length) {
            v[i] = auxiliar;
            contador = i;
            i++;
            if (i < v.length) {
                System.out.println("Dime un numero");
                auxiliar = darnumero.nextInt();
            }
        }

        for (i = 0; i <= contador; i++) {
            System.out.print(v[i] + " ");
        }

    }

}
