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
public class Z68_Ejercicio_6_arrays {

    private final static int FILA = 5;
    private final static int COLUMNA = 5;

    public static void main(String[] args) {
        int[][] diagonal = new int[5][5];
        int i;
        int j;

        for (i = 0; i < FILA; i++) {
            for (j = 0; j < COLUMNA; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                }
                else if (j == ((COLUMNA)-1-i)) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }
        for (i = 0; i < FILA; i++) {
            for (j = 0; j < COLUMNA; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
