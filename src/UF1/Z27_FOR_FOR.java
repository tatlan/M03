/*
 * Hacer las 10 tablas de multiplicar
 */
package UF1;

/**
 *
 * @author JuanAlfonso
 */
public class Z27_FOR_FOR {

    private static final int N = 10;
    private static final int M = 10;

    public static void main(String[] args) {

        int i;
        int j;
        int producto;

        for (j = 0; j <= M; j++) {
            System.out.println("Tabla del " + j);
            for (i = 0; i <= N; i++) {
                producto = j * i;
                System.out.println(j + "x" + i + " = " + producto);

            }
            System.out.println("---------------");
        }
    }

}
