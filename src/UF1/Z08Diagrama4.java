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
 * Dar 3 numeros y ordenarlos
 * 3*2*1=6
 * n1 n2 n3
 * n1 n3 n2
 * 
 * n2 n1 n3
 * n2 n3 n1
 * 
 * n3 n1 n2
 * n3 n2 n1
 * 
 * if (n1> n2 && n2 > n3) {
 * salida= n1 + "," + n2 + "," + n3;
 * }else if (n1>n3 && n3> n2) {
 * salida= n1 + "," + n3 + "," + n2;
 * }else if (n2>n1 && n1> n3) {
 * salida= n2 + "," + n1 + "," + n3;
 * }else if (n2>n3 && n3> n1) {
 * salida= n2 + "," + n3 + "," + n1;
 * }else if (n3>n1 && n1> n2) {
 * salida= n3 + "," + n1 + "," + n2;
 * }else (n3>n2 && n2> n1) {
 * salida= n3 + "," + n2 + "," + n1;
 * }
 * System.out.println(salida);
 * 
 * 
 * 
 * 
 */
public class Z08Diagrama4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a;
        int b;
        int c;
        String mensaje_primero;
        String mensaje_segundo;
        String mensaje_tercero;

        System.out.println("Introduce el primer numero:");
        a = teclado.nextInt();
        System.out.println("Introduce el segundo numero:");
        b = teclado.nextInt();
        System.out.println("Introduce el tercer numero:");
        c = teclado.nextInt();

        if (a > b && a > c) {
            mensaje_primero = "El mayor   es ... " + (a);
            if (b > c) {
                mensaje_segundo = "El segundo es ... " + (b);
                mensaje_tercero = "El tercero es ... " + (c);
            } else {
                mensaje_segundo = "El segundo es ... " + (c);
                mensaje_tercero = "El tercero es ... " + (b);
            }
        } else if (b > a && b > c) {
            mensaje_primero = "El mayor   es ... " + (b);
            if (a > c) {
                mensaje_segundo = "El segundo es ... " + (a);
                mensaje_tercero = "El tercero es ... " + (c);
            } else {
                mensaje_segundo = "El segundo es ... " + (c);
                mensaje_tercero = "El tercero es ... " + (a);
            }
        } else {
            mensaje_primero = "El mayor   es ... " + (c);
            if (a > b) {
                mensaje_segundo = "El segundo es ... " + (a);
                mensaje_tercero = "El tercero es ... " + (b);
            } else {
                mensaje_segundo = "El segundo es ... " + (b);
                mensaje_tercero = "El tercero es ... " + (a);
            }
        }

        System.out.println(mensaje_primero);
        System.out.println(mensaje_segundo);
        System.out.println(mensaje_tercero);
    }

}
