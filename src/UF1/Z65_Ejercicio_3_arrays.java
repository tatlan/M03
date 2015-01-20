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
public class Z65_Ejercicio_3_arrays {

    public static void main(String[] args) {
        int[] tabla = new int[20];

        Scanner darnumero = new Scanner(System.in);
        int i;
        boolean masde30 = false;

        for (i = 0; i < tabla.length; i++) {
            System.out.println("Dime un numero");
            tabla[i] = darnumero.nextInt();
        }

        for (i = 0; i < tabla.length; i++) {
            if (tabla[i] > 30) {
                System.out.println("Posición: " + i + " " + tabla[i]);
                masde30 = true;
            }
        }
        if (masde30==false) {
            System.out.println("NO HAY NUMEROS MAYORES DE 30");
        }

    }

}
