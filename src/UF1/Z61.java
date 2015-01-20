/*
 * En un array ver que valor es el maximo y cual el minimo.
 * 
 */
package UF1;

/**
 *
 * @author JuanAlfonso
 */
public class Z61 {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int mayor = a[0];
        int i;

        for (i = 1; i < a.length; i++) {
            if (a[i] > mayor) {
                mayor = a[i];
            }
        }
        System.out.println(mayor);
    }
}
