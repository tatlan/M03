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
public class Z70_Ejercicio_8_arrays {

    private final static int FILA = 5;
    private final static int COLUMNA = 15;

    public static void main(String[] args) {

        int[][] marco = new int[FILA][COLUMNA];
        int i;
        int j;

        for (i = 0; i < FILA; i++) {
            for (j = 0; j < COLUMNA; j++) {
                if (i == 0 || i == FILA - 1) {
                    marco[i][j] = 1;
                } else if (j == 0 || j == COLUMNA - 1) {
                    marco[i][j] = 1;
                } else {
                    marco[i][j] = 0;
                }
            }
        }
        for (i = 0; i < FILA; i++) {
            for (j = 0; j < COLUMNA; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
