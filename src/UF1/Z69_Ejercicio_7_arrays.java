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
public class Z69_Ejercicio_7_arrays {

    private final static int FILA = 10;
    private final static int COLUMNA = 10;

    public static void main(String[] args) {
        int[][] matriz = new int[FILA][COLUMNA];
        int i;
        int j;
        int sumafila = 0;
        int sumacolumna = 0;

        Random aleatorio = new Random();

        for (i = 0; i < FILA; i++) {
            for (j = 0; j < COLUMNA; j++) {
                matriz[i][j] = aleatorio.nextInt(10);
            }
        }

        for (i = 0; i < FILA; i++) {
            for (j = 0; j < COLUMNA; j++) {
                System.out.print(" " +matriz[i][j] + "    ");
                sumafila = sumafila + matriz[i][j];
            }
            System.out.print("Suma fila= " + sumafila);
            sumafila = 0;
            System.out.println("");
        }

        for (j = 0; j < COLUMNA; j++) {
            for (i = 0; i < FILA; i++) {
                
                sumacolumna = sumacolumna + matriz[i][j];
            }
            System.out.print(sumacolumna + "    ");
            sumacolumna = 0;
            
        }

    }

}
