/*
 * Ejercicio 11
 * Suma los n numeros pares introducidos 
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z31Ejercicio11 {

    public static void main(String[] args) {
        int n;
        int i = 1;
        int resultado = 0;
        Scanner darnumeros = new Scanner(System.in);

        System.out.println("Dime cuantos numeros");
        n = darnumeros.nextInt();

        while (i <= n) {
            if (i  % 2 == 0){
            resultado = resultado + i;
            }
            i++;
        }
        System.out.println("La suma es " + resultado);
    }

}
