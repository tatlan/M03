/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1;

import java.util.Random;

/**
 *
 * @author JuanAlfonso
 */
public class Z73_Ejercicio_11_arrays {

    public static void main(String[] args) {
        float[] vector = new float[10];
        Random aleatorio = new Random();
        int i;
        float maximo=0;

        for (i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextFloat();
            if (vector[i]>maximo)  {
                maximo = vector[i];
            }
        }

        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        System.out.println(maximo);

    }

}
