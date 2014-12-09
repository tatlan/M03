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
public class Z07Diagrama3 {

    public static void main(String[] args) {
        Scanner darnota = new Scanner(System.in);
        String mensaje;
        int nota;

        System.out.println("Dime que nota tienes:");
        nota = darnota.nextInt();
        //mensaje = "No me has dado una nota valida";
        if (nota == 10) {
            mensaje = "Tienes un sobresaliente";
        } else if (nota == 9) {
            mensaje = "Tienes un excelente";
        } else if (nota == 7 || nota == 8) {
            mensaje = "Tienes un notable";
        } else if (nota == 6) {
            mensaje = "Tienes un bien";
        } else if (nota == 5) {
            mensaje = "Tienes un suficiente";
        } else if (nota >= 0 && nota < 5) {
            mensaje = "Tienes un insuficiente";
        } else mensaje = "No me has dado una nota valida";
        System.out.println(mensaje);
    }

}
