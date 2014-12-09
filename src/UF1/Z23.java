/*
 * Que el usuario ponga numeros y se sumen solo los pares.
 * Al pulsar 0 se para el programa.
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z23 {

    public static void main(String[] args) {

        int numero;
        int resultado = 0;

        Scanner darnumero = new Scanner(System.in);
        System.out.println("Dime un numero");
        numero = darnumero.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                resultado = resultado + numero;
            }

            System.out.println("Dime un numero");
            numero = darnumero.nextInt();

        }

        System.out.println("El resultado es " + resultado);

    }

}
