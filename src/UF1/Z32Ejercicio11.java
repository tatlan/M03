/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z32Ejercicio11 {

    public static void main(String[] args) {
        int n;
        int i = 1;
        int resultado = 0;
        Scanner darnumeros = new Scanner(System.in);

        System.out.println("Dime cuantos numeros");
        n = darnumeros.nextInt();

        do {
            if (i % 2 == 0) {
                resultado = resultado + i;
            }
            i++;
        } while (i <= n);
        System.out.println("La suma es " + resultado);
    }

}
