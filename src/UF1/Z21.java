/*
 * Pedir numeros y dar la suma total.
 * Es tipo ACUMULADOR
 */
package UF1;
import java.util.Scanner;

/**
 *
 * @author JuanAlfonso
 */
public class Z21 {
    private final static int LIMITE=10;
    public static void main(String[] args) {
        
        int numero;
        int contador = 0;
        int resultado=0;
        Scanner darnumero = new Scanner(System.in);
        
                
        while (contador < LIMITE) {
            System.out.println("Dime el numero " + contador );
            numero = darnumero.nextInt();
            if (numero==0) break;
            resultado=resultado+numero;
            contador = contador + 1;
            /**
            * contador++;
            */
        
        }
        System.out.println("La suma es " + resultado);
        
        
    }
    
}
