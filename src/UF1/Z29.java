/*
 * Como Z28 pero dibujando un triangulo
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z29 {
    public static void main(String[] args) {

        int i;
        int j;
        int m;
        

        Scanner darfila = new Scanner(System.in);
        
        System.out.println("Dime anchura");
        m = darfila.nextInt();


        for (j = 0; j < m; j++) {

            for (i = 0; i < j+1; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
