/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03;
import java.util.Scanner;
/**
 *
 * @author JuanAlfonso
 */
public class M03 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1;
        int n2;
        int resultado;
        
        System.out.println("Introduce el primer numero");
        n1 = teclado.nextInt();
        System.out.println("Introduce el segundo");
        n2 = teclado.nextInt();
        resultado=n1+n2;
        System.out.println("El resultado es: "+resultado);
        
        
                
        
    }
    
}
