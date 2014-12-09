/*
 * Dar minimo, maximo y media.
 * Se acaba poniendo un negativo
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z37Ejercicio16 {

    public static void main(String[] args) {

        int maximo = 0;
        int minimo = 0;
        int contador = 0;
        int numero = 0;
        int suma=0;
        int media;

        Scanner darnumero = new Scanner(System.in);

        while (numero >= 0) {
            if (numero > maximo) {maximo = numero;}
            if (contador==1) {minimo=numero;}
            if (numero < minimo) {minimo = numero;}
            
            System.out.println("Dime un numero, si es negativo paramos");

            numero = darnumero.nextInt();
            if (numero < 0) {break;}
            contador++;
            suma=suma+numero;
        }
        System.out.println("El maximo es " + maximo);
        System.out.println("El minimo es " + minimo);
        media=suma/contador;
        System.out.println("La media es " + suma +'/' + contador + '=' + media);
    }
}
