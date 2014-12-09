/*
 * Calcular el factorial de un número N (siendo N un número que se lee).
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z46 {

    public static void main(String[] args) {
        int i;
        int numero;
        int j = 1;

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
