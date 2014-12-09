/*
 * Leer un dato y almacenarlo en la variable n. Calcular el valor de 2 elevado a la potencia
 n
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z49 {

    public static void main(String[] args) {
        int i;
        int numero;
        int resultado=1;

        Scanner darnumero = new Scanner(System.in);

        System.out.println("Dime un numero");
        numero = darnumero.nextInt();
        if (numero==0) {resultado=0;}
        for (i = 1; i <= numero; i++) {
            resultado = resultado * 2;

        }
         System.out.println("El resultado es " + resultado);
    }

}
