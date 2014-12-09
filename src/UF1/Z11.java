/*
 * Escriure un programa que llegeixi un caràcter i digui si correspon a una vocal o a
 * una consonant. Si no és ni una vocal ni una consonant, s’haurà de donar un missatge
 * d’error.
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char a;
        String mensaje;
        System.out.println("Introduce una letra:");
        a = teclado.next().charAt(0);

        if ((a > 96 && a < 123) || (a > 64 && a < 91)) {
            if (a == 97 || a == 101 || a == 105 || a == 111 || a == 117 || a == 65 || a == 69 || a == 73 || a == 79 || a == 85) {
                mensaje = "Es vocal";
            } else {
                mensaje = "No es vocal";
            }
        } else {
            mensaje = "No es letra";
        }

        System.out.println(mensaje);

    }
}
