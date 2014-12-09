/*
 * Escriure un programa que llegeixi tres nombres enters i digui quin és el 
 * màxim i quin el mínim, amb el menor nombre de comparacions possibles.
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 * Dar 3 numeros y dar maximo y minimo
 * 
 */
public class Z10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a;
        int b;
        int c;
        String mensaje_maximo;
        String mensaje_minimo;
        

        System.out.println("Introduce el primer numero:");
        a = teclado.nextInt();
        System.out.println("Introduce el segundo numero:");
        b = teclado.nextInt();
        System.out.println("Introduce el tercer numero:");
        c = teclado.nextInt();

        if (a > b && a > c) {
            mensaje_maximo = "El máximo   es ... " + (a);
            if (b > c) {
                mensaje_minimo = "El mínimo es ... " + (c);
            } else {
                mensaje_minimo = "El mínimo es ... " + (b);
            }
        } else if (b > a && b > c) {
            mensaje_maximo = "El máximo es ... " + (b);
            if (a > c) {
                mensaje_minimo = "El mínimo es ... " + (c);
            } else {
                mensaje_minimo = "El mínimo es ... " + (a);
            }
        } else {
            mensaje_maximo = "El máximo es ... " + (c);
            if (a > b) {
                mensaje_minimo = "mínimo es ... " + (b);
            } else {
                mensaje_minimo = "El mínimo es ... " + (a);
            }
        }

        System.out.println(mensaje_maximo);
        System.out.println(mensaje_minimo);
        
    }

}
