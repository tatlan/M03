/*
 * Pedir filas y columnas y imprimir asteriscos hacer un cuadrado
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z28 {

    public static void main(String[] args) {

        int i;
        int j;
        int m;
        int n;

        Scanner darfila = new Scanner(System.in);
        Scanner darcolumna = new Scanner(System.in);
        System.out.println("Dime filas");
        m = darfila.nextInt();
        System.out.println("Dime columnas");
        n = darcolumna.nextInt();

    /*
      * for (int j = 1; j <= m; j++) {
    */    
        for (j = 1; j <= m; j++) {

            for (i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
