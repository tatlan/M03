/*
 * Escriure un programa que llegeixi dos nombres enters i digui si el primer és
 * divisible pel segon o no.
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Introduce el primer numero:");
        a = teclado.nextInt();
        System.out.println("Introduce el segundo numero:");
        b = teclado.nextInt();
        
        String mensaje;

        if (a % b == 0) {
            mensaje = "Es divisible";
        } else {
            mensaje = "NO es divisible";
        }

        System.out.println(mensaje);

    }
}
