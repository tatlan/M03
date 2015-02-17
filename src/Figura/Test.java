/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

/**
 *
 * @author JuanAlfonso
 */
public class Test {

    public static void main(String[] args) {

        Punto a = new Punto(1, 5);
        Punto b = new Punto(1, 6);
        System.out.println(a);

        boolean c = a.igual(b);
        System.out.println(c);

        double d = a.distancia(b);
        System.out.println(d);

        a.desplazar(b);

        System.out.println(a);
/* a=setX(9);
        a=setY(5);
        */
    }

}
