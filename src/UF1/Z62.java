/*
 * Introducir lo numeros por teclado en el array.
 * Y decir cual es el maximo
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z62 {

    public static void main(String[] args) {
        int[] a = new int[5];
        int mayor = 0;
        int i;

        Scanner darnumero = new Scanner(System.in);

        for (i = 0; i < a.length; i++) {
            System.out.println("Dime un numero");
            a[i] = darnumero.nextInt();
            if (a[i] > mayor) {
                mayor = a[i];
            }
        }

        for (i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");

        }
        System.out.println("El maximo es " + mayor);
    }
}

