/*
 * Imprimir los números pares desde N (siendo N un número par que se lee) en forma
 descendente hasta 2. 
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z43 {

    public static void main(String[] args) {
        int n;
        int i;
        System.out.println("Dime un numero");
        Scanner darnumero = new Scanner(System.in);

        n = darnumero.nextInt();

        for (i = n; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
