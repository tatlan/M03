/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author JuanAlfonso
 */
public class Examen4 {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        int pedirnumero;
        int i;
        int posicion = -1;

        Random aleatorio = new Random();
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(10);
        }

        Scanner darnumero = new Scanner(System.in);
        System.out.println("Dime un numero y te dire su posicion en el array ");
        pedirnumero = darnumero.nextInt();

        System.out.print("Este es el array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");

        }
        for (i = 0; i < numeros.length; i++) {
            if (pedirnumero == numeros[i]) {
                posicion = i;
            }
        }
        System.out.println("");
        System.out.print("El numero está en la posicion " + posicion);
    }

}
