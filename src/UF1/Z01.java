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
public class Z01 {
    
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
        System.out.println("Introduce el resultado de la suma");
        resultado=teclado.nextInt();
        
        /*System.out.println("El resultado es: "+resultado);
        */
        // para poner texto
        if (n1+n2==resultado) {
            System.out.println("El resultado es correcto muy bien Lidia");
        }else {
            System.out.println("ERROR");
            
        } 
        
        
                
        
    }
    
}
