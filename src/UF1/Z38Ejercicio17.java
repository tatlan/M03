/*
 * Cuenta cuantos numeros positivos y negativos se introducen
 * Se para con 0
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z38Ejercicio17 {

    public static void main(String[] args) {

        int n;
        int numero;
        int cuentapos = 0;
        int cuentaneg = 0;

        Scanner darnumero = new Scanner(System.in);

        do {
            System.out.println("Dime un numero pos o neg, si es 0 paramos");
            numero = darnumero.nextInt();
            if (numero > 0) {
                cuentapos = cuentapos + 1;
            }
            if (numero < 0) {
                cuentaneg = cuentaneg + 1;
            }
        } while (numero != 0);

        System.out.println("Positivos " + cuentapos);
        System.out.println("Negativos " + cuentaneg);
    }

}
