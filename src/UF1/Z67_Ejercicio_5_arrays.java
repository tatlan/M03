/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1;

/**
 *
 * @author JuanAlfonso
 */
public class Z67_Ejercicio_5_arrays {

    private final static int COLUMNA = 10;
    private final static int FILA = 10;

    public static void main(String[] args) {
        int[][] tabla = new int[10][10];
        int i;
        int j;

        for (i = 0; i < FILA; i++) {
            if (i % 2 == 0) {
                for (j = 0; j < COLUMNA; j++) {
                    tabla[i][j] = 1;
                }

            } else {
                for (j = 0; j < COLUMNA; j++) {
                    tabla[i][j] = 0;
                }
            }
        }
        for (j = 0; j < 10; j++) {
            for (i = 0; i < FILA; i++) {
                System.out.print(tabla[j][i] + " ");
            }
            System.out.println("");
        }

    }

}
