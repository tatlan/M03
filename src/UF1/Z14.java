/*
 * Convertir l’estructura switch/case de l’exercici anterior a una estructura equivalent
 * utilitzant if/else
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z14 {
    public static void main(String[] args) {
        Scanner dardia = new Scanner(System.in);
        String mensaje;
        int dia;
        System.out.println("Dime un numero entre 1 y 7");
        dia = dardia.nextInt();
        if (dia==1){
                mensaje = "Lunes";
        }else if (dia==2){
                mensaje = "Martes";
        }else if (dia==3){
                mensaje = "Miercoles";
        }else if (dia==4){
                mensaje = "Jueves";
        }else if (dia==5){
                mensaje = "Viernes";
        }else if (dia==6){
                mensaje = "Sabado";
        }else if (dia==7){
                mensaje = "Domingo";
        }else mensaje="Error";

        
        System.out.println(mensaje);
    }

    
}
