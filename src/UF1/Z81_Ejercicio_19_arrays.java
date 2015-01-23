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
public class Z81_Ejercicio_19_arrays {

    public static void main(String[] args) {

        String[] nombre = {"juan", "pedro", "ismael", "pablo", "jaime"};
        /*float notas [][]=new float [5][5];*/

        double notas[][] = {
            {5.2, 2, 3, 4.5, 10},
            {6, 3, 5, 7, 8},};
        String alumno;
        int nota1;
        int nota2;
        int i;

        for (i = 0; i < nombre.length; i++) {

            Scanner daralumno = new Scanner(System.in);
            System.out.println("Dime nombre de alumno:");
            alumno = daralumno.next();
            Scanner darnota1 = new Scanner(System.in);
            Scanner darnota2 = new Scanner(System.in);
            System.out.println("Dime nota primer parcial:");
            nota1 = darnota1.nextInt();
            System.out.println("Dime nota segundo parcial:");
            nota2 = darnota2.nextInt();

            nombre[i] = alumno;
            notas[0][i] = nota1;
            notas[1][i]=nota2;

        }
        for (i = 0; i < nombre.length; i++) {
        System.out.println("Nombre " + nombre[i] + " Nota primera " + notas[0][i] + " Nota segunda " + notas[1][i]);
        }
    }

}
