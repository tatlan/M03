/*
 * Tabla de multiplicar con FOR
 */
package UF1;

/**
 *
 * @author JuanAlfonso
 */
public class Z25 {

    private static final int N = 4;

    public static void main(String[] args) {

        int i;
        int producto;

        for (i = 0; i <= 10; i++) {
            producto = N * i;
            System.out.println(N + "x" + i + " = " + producto);

        }

    }

}
