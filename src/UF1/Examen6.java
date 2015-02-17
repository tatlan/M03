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
public class Examen6 {

    public static void main(String[] args) {

        int[][] tabla = new int[10][10];
        int i;
        int j;
        int mayor;
        int vecinos = 0;
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

        for (i = 0; i < tabla.length; i++) {
            for (j = 0; j < tabla.length; j++) {

                if (i == 0 && j == 0) {
                    vecinos = tabla[i][j + 1] + tabla[i + 1][j] + tabla[i + 1][j + 1];
                    System.out.println(vecinos);
                }
                                
                if (i == 0 && j != 0 && j != 9) {
                    vecinos = tabla[i][j + 1] + tabla[i][j - 1] + tabla[i + 1][j - 1] + tabla[i + 1][j + 1] + tabla[i + 1][j];
                    System.out.println(vecinos);
                }
                if (i == 0 && j == 9) {
                    vecinos = tabla[i][j - 1] + tabla[i + 1][j - 1] + tabla[i + 1][j];
                    System.out.println(vecinos);
                }
                
                
                
                
                if (i == 9 && j == 0) {
                    vecinos = tabla[i][j + 1] + tabla[i -1][j] + tabla[i -1][j + 1];
                    System.out.println(vecinos);
                }
                                
                if (i == 9 && j != 0 && j != 9) {
                    vecinos = tabla[i][j + 1] + tabla[i][j - 1] + tabla[i - 1][j - 1] + tabla[i -1][j + 1] + tabla[i - 1][j];
                    System.out.println(vecinos);
                }
                if (i == 9 && j == 9) {
                    vecinos = tabla[i][j - 1] + tabla[i -1][j - 1] + tabla[i - 1][j];
                    System.out.println(vecinos);
                }
                
                
                

            }
        }

    }

}
