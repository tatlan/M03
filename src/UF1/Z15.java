/*
 * Suposant que la variable nota només pot agafar valors enters, convertir l’estructura
 * següent en una altra equivalent utilitzant la instrucció switch/case.
 * int nota;
 * char acta;
 * if ((nota >= 0) && (nota <=4) acta = ‘S’;
 * else if ((nota == 5) || (nota == 6)) acta = ‘A’;
 * else if ((nota == 7) || (nota == 8)) acta = ‘N’;
 * else if (nota == 9) acta = ‘E’;
 * else if (nota == 10) acta = ‘M’;
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z15 {

    public static void main(String[] args) {
        Scanner darnota = new Scanner(System.in);
        String mensaje;
        int nota;
        System.out.println("Dime la nota");
        nota = darnota.nextInt();
        switch (nota) {
            case 0:
                mensaje = "S";
                break;
            case 1:
                mensaje = "S";
                break;
            case 2:
                mensaje = "S";
                break;
            case 3:
                mensaje = "S";
                break;
            case 4:
                mensaje = "S";
                break;
            case 5:
                mensaje = "A";
                break;
            case 6:
                mensaje = "A";
                break;
            case 7:
                mensaje = "N";
                break;
            case 8:
                mensaje = "N";
                break;
            case 9:
                mensaje = "E";
                break;
            case 10:
                mensaje = "M";
                break;

            default:
                mensaje = "No es una nota valida";

        }
        System.out.println(mensaje);

    }
}