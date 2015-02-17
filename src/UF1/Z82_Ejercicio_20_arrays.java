/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1;

import java.util.*;
import java.awt.*;

/**
 *
 * @author JuanAlfonso
 */
public class Z82_Ejercicio_20_arrays {

    public static void main(String[] args) {
        int[][] tablero = new int[5][10];

        String[][] notas = {
            {"O", "n", "O", "O", "O"},
            {"O", "O", "O", "v", "O"},
            {"O", "v", "n", "O", "O"},
            {"O", "O", "x", "O", "O"},
            {"O", "O", "O", "n", "O"}};
        int i;
        int j;

        for (i = 0; i < 5; i++) {

            for (j = 0; j < 5; j++) {

                System.out.print(notas[i][j]);
            }

            System.out.println("");

        }

    }
}
