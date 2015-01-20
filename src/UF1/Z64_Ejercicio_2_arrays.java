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
public class Z64_Ejercicio_2_arrays {

    public static void main(String[] args) {
        int[] vector = new int[15];
        Scanner darnumero = new Scanner(System.in);
        int i;
        int n=4;
        int resultado=0;
        String tabla="Valores del array: ";

        for (i = 0; i < vector.length; i++) {
            System.out.println("Dime un numero");
            vector[i] = darnumero.nextInt();
            tabla=tabla+" "+vector[i];
            if (i<=n){resultado=resultado+vector[i];}
        }
        System.out.println(tabla);
        System.out.println(resultado);
        
    }

}
