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
public class Examen1 {

    public static void main(String[] args) {
        boolean S1 = false;
        boolean S2 = false;
        boolean S3 = true;

        String mensaje1 = "Alarma activada";
        String mensaje2 = "Alarma aun desactivada";

        if (S1 == false && S2 == true) {
            System.out.println(mensaje1);
        }
        else if (S1 == true && S3 == false) {
            System.out.println(mensaje1);
        }
        else if (S1 == false && S2 == true && S3 == true) {
            System.out.println(mensaje1);
        }
        else if (S1 == true && S2 == true && S3 == true) {
            System.out.println(mensaje1);
        }
        else {
            System.out.println(mensaje2);}

    }

}
