/*
 * Escriure un programa, que a partir del valor numèric de la nota d’un alumne i fent
 * servir el mínim nombre de comparacions, escrigui un caràcter que codifiqui la nota
 * que li sortirà a l’acta, segons la taula següent:
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z12 {

    public static void main(String[] args) {
        Scanner darnota = new Scanner(System.in);
        String mensaje;
        double nota;

        System.out.println("Dime que nota tienes:");
        nota = darnota.nextDouble();
        if (nota >= 0 && nota<5) {
            mensaje = "S";
        } else if (nota >= 5 && nota<6.5) {
            mensaje = "A";
        } else if (nota >= 6.5 && nota<8.5) {
            mensaje = "N";
        } else if (nota >= 8.5 && nota<9.75) {
            mensaje = "E";
        } else if (nota >= 9.75 && nota<=10) {
            mensaje = "M";
        } else mensaje = "No me has dado una nota valida";
        System.out.println(mensaje);
    }

}
