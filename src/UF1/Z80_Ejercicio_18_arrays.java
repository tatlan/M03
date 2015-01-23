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
public class Z80_Ejercicio_18_arrays {

    public static void main(String[] args) {

        int[] liminf = {0, 1000000, 2500001, 3800001};
        int[] limisup = {999999, 2500000, 3800000, 6000000};
        int[] pct = {5, 12, 15, 22, 30};
        int salario;
        int i;
        int infaux = 0;
        int supaux = 0;
        int poraux = 0;

        Scanner darsalario = new Scanner(System.in);
        System.out.println("Dime tu salario");
        salario = darsalario.nextInt();

        for (i = 0; i < liminf.length; i++) {
            if (salario >= liminf[i] && salario <= limisup[i]) {
                infaux = liminf[i];
                supaux = limisup[i];
                poraux = pct[i];
            } else if (salario > limisup[3]) {
                infaux = limisup[3];
                supaux = limisup[3];
                poraux = pct[4];
            }

        }

        System.out.println("inferior " + infaux);
        System.out.println("superior " + supaux);
        System.out.println("porcentaje " + poraux);
        System.out.println("Salario " + salario+ " Porcentaje "+poraux +" Total "+ (salario*poraux)/100);
        

    }

}
