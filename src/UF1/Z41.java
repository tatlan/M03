/*
 * Imprimir un listado con los números del 1 al 100 cada uno con su respectivo cuadrado 
 */
package UF1;

/**
 *
 * @author JuanAlfonso
 */
public class Z41 {

    private static final int LIMITE = 100;

    public static void main(String[] args) {

        int i = 1;

        for (i = 1; i <= LIMITE; i++) {
            System.out.println(i + " Su cuadrado es " + i * i);

        }
    }

}
