/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1;

/**
 *
 * @author JuanAlfonso
 */
public class Z66_Ejercicio_4_arrays {

    public static void main(String[] args) {

        int i;
        int[] origen = {1, 4, 10, 32, 60, 91, 34, 56, 73, 88, 86};
        int[] destino = new int[11];
        int cuenta = 0;

        for (i = 0; i < origen.length; i++) {
            if (origen[i] % 2 == 0 && origen[i] > 25) {
                destino[cuenta] = origen[i];
                cuenta++;
            }
        }
        for (i = 0; i < origen.length; i++) {
            System.out.print(origen[i] + " ");
        }
        System.out.println("");
        for (i = 0; i < destino.length; i++) {
            System.out.print(destino[i] + " ");
        }

    }

}
