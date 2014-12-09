/* Lo mismo que Z22 pero usando DO
 * Que el usuario adivine un numero. Si acierta se acaba.
 * Tipo SEMAFORO
 */
package UF1;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author JuanAlfonso
 */
public class Z24 {

    private final static int LIMITE = 3;

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int numerosecreto;
        int intentos = 0;
        int numerousuario;

        String mensaje;
        mensaje = "Has fallado";

        numerosecreto = aleatorio.nextInt(10);
        System.out.println(numerosecreto);
        Scanner darnumero = new Scanner(System.in);

        do {
            System.out.println("Dime un numero ");
            numerousuario = darnumero.nextInt();

            if (numerousuario == numerosecreto) {
                mensaje = "Has acertado";
                break;
            }
            intentos = intentos + 1;
        } while (intentos < LIMITE);

        System.out.println(mensaje);

    }

}
