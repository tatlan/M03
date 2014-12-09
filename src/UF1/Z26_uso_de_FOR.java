/*
 * Pedir 20 numeros y decir cuanto son mayores de 5
 * Hemos de usar FOR
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z26_uso_de_FOR {
    
    private static final int N = 5;
    private static final int INTENTOS = 20;
    public static void main(String[] args) {
        int i;
        int numerosecreto;
        int numerousuario;
        int resultado = 0;
        Scanner darnumero = new Scanner(System.in);
/**
 * for (i = 0; i < 20; i=i+2) {
 *  for (i = 0; i < 20; i--) {
 */
        for (i = 0; i < 20; i++) {
            System.out.println("Dime un numero ");
            numerousuario = darnumero.nextInt();

            if (numerousuario > N) {
                resultado++;
            }
        }
        
        System.out.println("Hay " + resultado + " mayores de " + N);
    }

}
