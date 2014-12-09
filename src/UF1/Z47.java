/*
 * Calcular el factorial de 10 números diferentes cuyos valores se leen.
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z47 {

    private static final int LIMITE = 10;

    public static void main(String[] args) {

        int i;
        int numero;
        int j = 1;
        int k;

        for (k = 1; k <= LIMITE; k++) {
            int factorial = 1;

            Scanner darnumero = new Scanner(System.in);

            System.out.println("Dime un numero");
            numero = darnumero.nextInt();

            for (i = 1; i <= numero; i++) {
                factorial = factorial * i;
            }

            System.out.println(" factorial= " + factorial);
        }

    }

}
