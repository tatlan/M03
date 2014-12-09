/*
 * Escriure un programa que llegeixi un nombre N més gran que zero i digui quantes
 * vegades és divisible aquest nombre per 2.
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z40Ejercicio19 {

    public static void main(String[] args) {

        int n;
        int numero;
        int contador = 0;

        Scanner darnumero = new Scanner(System.in);

        System.out.println("Dime un numero");
        numero = darnumero.nextInt();
        if (numero > 0) {
            while (numero % 2 == 0) {
                contador++;
                numero = numero / 2;
            }
            System.out.println("Se puede dividir " + contador + " veces por 2");
        }

    }

}
