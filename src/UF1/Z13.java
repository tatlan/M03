/*
 * Escriure un programa que llegeixi un nombre entre 1 i 7, i utilitzant l’estructura
 * condicional switch/case, escrigui el nom del dia de la setmana corresponent. És a dir
 * si s’introdueix un 1, ha d’escriure “dilluns”, si s’introdueix un 2, ha d’escriure
 * “dimarts”, etc,
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z13 {

    public static void main(String[] args) {
        Scanner dardia = new Scanner(System.in);
        String mensaje;
        int dia;
        System.out.println("Dime un numero entre 1 y 7");
        dia = dardia.nextInt();
        switch (dia) {
            case 1:
                mensaje = "Lunes";
                break;
            case 2:
                mensaje = "Martes";
                break;
            case 3:
                mensaje = "Miercoles";
                break;
            case 4:
                mensaje = "Jueves";
                break;
            case 5:
                mensaje = "Viernes";
                break;
            case 6:
                mensaje = "Sabado";
                break;
            case 7:
                mensaje = "Domingo";
                break;
            default: mensaje="Error";

        }
        System.out.println(mensaje);
    }

}
