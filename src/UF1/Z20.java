/*
 * Hacer la tabla de multiplicar de un numero
 * usando while
 * es tipo CONTADOR
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z20 {

    public static void main(String[] args) {
        int numero;
        int contador = 0;
        int resultado;

        Scanner darnumero = new Scanner(System.in);

        System.out.println("Dime un numero");
        numero = darnumero.nextInt();

        while (contador <= 10) {
            resultado = numero * contador;
            System.out.print(numero + "x" + contador + "=" + resultado + "\n");
            contador = contador + 1;

        }
        System.out.println();
    }

}
