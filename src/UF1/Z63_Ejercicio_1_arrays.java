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
public class Z63_Ejercicio_1_arrays {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner darnumero = new Scanner(System.in);
        int i;

        for (i = 0; i < numeros.length; i++) {
            System.out.println("Dime un numero");
            numeros[i] = darnumero.nextInt();
        }

        for (i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " cuadrado: " + numeros[i] * numeros[i] + " cubo: " + numeros[i] * numeros[i] * numeros[i]);

        }

    }

}
