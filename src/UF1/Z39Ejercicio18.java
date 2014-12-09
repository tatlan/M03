/*
 * Escriure un programa que llegeixi un nombre N més gran que zero i escrigui la
 * sèrie: 2 elevado 1 ,2 elevado 2 ,,2 elevado N
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z39Ejercicio18 {

    public static void main(String[] args) {

        int n;
        int numero;

        Scanner darnumero = new Scanner(System.in);

        System.out.println("Dime un numero");
        numero = darnumero.nextInt();

        if (numero > 0) {
            for (n = 1; n <= numero; n++) {
                System.out.println("2 elevado a " + n);
            }

        } else {
            System.out.println("No era mayor de 0");
        }

    }

}
