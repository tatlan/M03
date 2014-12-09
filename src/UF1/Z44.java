/*
 * Imprimir los 100 primeros números de Fibonacci. Recuerde que un número de Fibonacci
 se calcula como la suma de los dos anteriores así:
 0, 1, 1, 2, 3, 5, 8,13…
 */
package UF1;

/**
 *
 * @author JuanAlfonso
 */
public class Z44 {

    public static void main(String[] args) {
        long a = 0;
        long b = 0;
        long c = 0;
        int i = 0;

        for (i = 0; i < 100; i++) {
            c = a + b;
            a = b;
            if (b == 0) {
                b = b + 1;
            } else {
                b = c;
            }
            System.out.println(c);
        }

    }

}
