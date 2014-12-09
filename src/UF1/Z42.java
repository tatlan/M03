/*
 * Imprimir un listado con los números impares desde 1 hasta 999 y seguidamente otro
 listado con los números pares desde 2 hasta 1000 
 */
package UF1;

/**
 *
 * @author JuanAlfonso
 */
public class Z42 {

    private static final int INICIO = 0;
    private static final int FIN = 1000;

    public static void main(String[] args) {
        int i;
        
        for (i = INICIO+1; i <= FIN; i=i+2) {
            System.out.println(i);
        }
        for (i = INICIO+2; i <= FIN; i=i+2) {
            System.out.println(i);
        }

    }

}
