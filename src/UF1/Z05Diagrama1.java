/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF1;

import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z05Diagrama1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precio;
                
        
        System.out.println("Introduce el importe");
        precio = teclado.nextDouble();
        if (precio >= 30) {
            precio = precio * 0.9;
                   } 

        System.out.println("Te voy a cobrar "+ precio);
        

    }
}
