/*
 * Escriure un programa que llegeixi el número d’un mes (entre 1 i 12), i un any, i
 * indiqui el nombre de dies que té aquell mes. Recordar que el mes de febrer té 29
 * dies si l’any és divisible per 4, menys quan també és divisible per 100 però no per
 * 400. Així, el mes de febrer de 1900 va tenir 28 dies, però el de 2000 en va tenir 29
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z16 {

    public static void main(String[] args) {
        int mes;
        int año;
        String mensaje;
        Scanner darmes = new Scanner(System.in);
        Scanner daraño = new Scanner(System.in);
        System.out.println("Dime un mes");
        mes = darmes.nextInt();
        System.out.println("Dime un año");
        año = daraño.nextInt();

        if (mes == 1) {
            mensaje = "Tiene 31 dias";
        } else if (mes == 3) {
            mensaje = "Tiene 31 dias";
        } else if (mes == 4) {
            mensaje = "Tiene 30 dias";
        } else if (mes == 5) {
            mensaje = "Tiene 31 dias";
        } else if (mes == 6) {
            mensaje = "Tiene 30 dias";
        } else if (mes == 7) {
            mensaje = "Tiene 31 dias";
        } else if (mes == 8) {
            mensaje = "Tiene 31 dias";
        } else if (mes == 9) {
            mensaje = "Tiene 30 dias";
        } else if (mes == 10) {
            mensaje = "Tiene 31 dias";
        } else if (mes == 11) {
            mensaje = "Tiene 30 dias";
        } else if (mes == 12) {
            mensaje = "Tiene 31 dias";
        } else if (mes == 2) {
            if (año % 4 != 0) {
                mensaje = "Tiene 28 dias";
            } else if (año % 100 != 0) {
                mensaje = "Tiene 29 dias";
            } else if (año % 400 != 0) {
                mensaje = "Tiene 28 dias";
            } else {
                mensaje = "Tiene 29 dias";
            }
        } else {
            mensaje = "No me has dado un mes valido";
        }
        System.out.println(mensaje);
    }

}
