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

        /*String[] nombre = {"juan", "pedro", "ismael", "pablo", "jaime"};*/
       String[] nombre= new String[5];
        /*double notas[][] = {
            {5.2, 2, 3, 4.5, 10},
            {6, 3, 5, 7, 8},};*/
        
        double[][] notas = new double[2][5];
        String alumno;
        int nota1;
        int nota2;
        int i;
        int j;
        double notafinal;
        double notamaxima = 0;
        int porcentaje1;
        int porcentaje2;

        Scanner darporcentaje = new Scanner(System.in);
        System.out.println("Dime porcentaje del valor del primer parcial:");
        porcentaje1 = darporcentaje.nextInt();
        if (porcentaje1 > 100 || porcentaje1 < 0) {

            while (porcentaje1 > 100 || porcentaje1 < 0) {
                System.out.println("Entre 0 y 100 por favor");
                System.out.println("Dime porcentaje del valor del primer parcial:");
                porcentaje1 = darporcentaje.nextInt();
            }
        }
        porcentaje2 = 100 - porcentaje1;

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
            notas[1][i] = nota2;
            if (notas[0][i] > notamaxima) {
                notamaxima = notas[0][i];
            }
            if (notas[1][i] > notamaxima) {
                notamaxima = notas[1][i];
            }

        }
        for (i = 0; i < nombre.length; i++) {
            System.out.println("Nombre " + nombre[i] + " Nota primera " + notas[0][i]
                    + " Nota segunda " + notas[1][i] + " Media " + (notas[0][i] + notas[1][i]) / 2);
        }

        for (i = 0; i < nombre.length; i++) {

            notafinal = (notas[0][i] + notas[1][i]) / 2;
            if (notafinal >= 5) {
                System.out.println("Nombre " + nombre[i] + " Nota primera " + notas[0][i]
                        + " Nota segunda " + notas[1][i] + " Media " + ((notas[0][i] * porcentaje1/100)
                        + (notas[1][i] * porcentaje2/100)) / 2 + " Aprobado");
            } else {
                System.out.println("Nombre " + nombre[i] + " Nota primera " + notas[0][i]
                        + " Nota segunda " + notas[1][i] + " Media " + ((notas[0][i] * porcentaje1/100)
                                + (notas[1][i] * porcentaje2/100)) / 2
                        + " Suspendido");

            }
        }
        System.out.println("La nota maxima es " + notamaxima);
        System.out.println("Porcentaje 1 " + porcentaje1);
        System.out.println("Porcentaje 2 " + porcentaje2);

        for (i = 0; i < 2; i++) {
            for (j = 0; j < nombre.length; j++) {
                if (notas[i][j] == notamaxima) {
                    System.out.println(nombre[j] + " Ha conseguido nota maxima");

                }

            }
        }
    }

}
