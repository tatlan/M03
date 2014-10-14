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
public class Z06Diagrama2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero_secreto;
        int numero_usuario;
        numero_secreto=456;
        String mensaje;
        
        System.out.println("Introduce el numero");
        numero_usuario = teclado.nextInt();
        if (numero_secreto == numero_usuario) {
        mensaje="Has acertado, felicidades";
        } else {
         mensaje="Mala suerte";
        }
      System.out.println(mensaje);  
    }
    
}
