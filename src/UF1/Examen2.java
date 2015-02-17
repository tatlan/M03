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
public class Examen2 {

    public static void main(String[] args) {

        int numero;
        int i;
        int menor;
        Scanner damenumero = new Scanner(System.in);
        System.out.println("Dime un numero ");
        numero = damenumero.nextInt();
        menor = numero;
        for (i = 0; i < 9; i++) {

            System.out.println("Dime un numero ");
            numero = damenumero.nextInt();
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("El numero menor es " + menor);
    }

}
