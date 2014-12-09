/*
 * Escriure un programa (amb les tres estructures iteratives, while..., do ... while i for
...) que llegeixi un nombre N més gran que zero i calculi la suma 1 + 2 + 3 + .... + N.
 */
package UF1;
import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z34Ejercicio12 {
    public static void main(String[] args) {
        int n;
        int i = 0;
        int resultado = 0;
        Scanner darnumeros = new Scanner(System.in);

        System.out.println("Dime cuantos numeros");
        n = darnumeros.nextInt();

        while (i <= n) {
          resultado=resultado+i;
            i++;
        }
        System.out.println("La suma es " + resultado);
    }

    
    
}
