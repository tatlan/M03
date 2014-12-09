/*
 * Imprimir los números de 1 a N (siendo N un número que se lee) cada uno con su
 respectivo factorial.
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z45 {

    public static void main(String[] args) {

        int i;
        int numero;
        int j=1;
        int k;
        int factorial = 1;

        Scanner darnumero = new Scanner(System.in);

        System.out.println("Dime un numero");
        numero = darnumero.nextInt();

        for (i = 1; i <= numero; i++) {
            for (j = 1; j <= i; j++) {
                factorial = factorial * j;
            }

            System.out.println(i+ " factorial= "+factorial);
            factorial=1;
        }

    }

}
