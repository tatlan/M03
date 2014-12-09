/*
 * Leer 20 números y encontrar el mayor y el menor valor leídos.
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z48 {

    private static final int LIMITE = 20;

    public static void main(String[] args) {
        int i;
        int numero;
        int minimo = 0;
        int maximo = 0;

        Scanner darnumero = new Scanner(System.in);

        for (i = 1; i <= LIMITE; i++) {

            System.out.println("Dime un numero");
            numero = darnumero.nextInt();
            if (i == 1) {
                maximo = numero;
                minimo = numero;
            }

            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }
        System.out.println("El maximo es " + maximo);
        System.out.println("El minimo es " + minimo);
    }
}
