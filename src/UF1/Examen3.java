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
public class Examen3 {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 2;
        int d;
        int i;
        System.out.print(a+" "+b+" "+c+" ");
        
        for (i = 0; i < 30; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;

            System.out.print(d+" ");
        }

    }

}
