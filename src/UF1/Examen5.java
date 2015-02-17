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
public class Examen5 {

    public static void main(String[] args) {

        int[][] tabla = new int[10][10];
        int i;
        int j;
        Random aleatorio = new Random();

        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla.length; j++) {
                tabla[i][j] = aleatorio.nextInt(10);
            }
        }
        
        
        System.out.println("Array original");
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla.length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("Array traspuesto");
        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla.length; j++) {
                System.out.print(tabla[j][i] + " ");
            }
            System.out.println("");
        }
    }

}
