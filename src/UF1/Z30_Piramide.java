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
public class Z30_Piramide {

    public static void main(String[] args) {

        int i;
        int j;
        int m;
        int n;

        Scanner darfila = new Scanner(System.in);

        System.out.println("Dime altura");
        m = darfila.nextInt();

        for (j = 0; j < m; j++) {
            for (n = j; n < m; n++) {
                System.out.print(" ");
            }
            for (i = 0; i < (j + j + 1); i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
