/*
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
public class Z22 {

    private final static int LIMITE = 3;

    public static void main(String[] args) {

        Random aleatorio = new Random();
        int numerosecreto;
        int intentos = 0;
        int numerousuario;
        boolean acierto = false;

        String mensaje;
        mensaje = "Has fallado";

        numerosecreto = aleatorio.nextInt(10);
        System.out.println(numerosecreto);
        Scanner darnumero = new Scanner(System.in);

        /**
         * while (!acierto && intentos < LIMITE){ numerosecreto =
         * aleatorio.nextInt(10); if (numerousuario==numerosecreto) acierto=
         * true; intentos=intentos + 1;
         *
         * }
         * if (acierto) { mensaje="Has acertado"; } else { mensaje="Has
         * fallado"; } System.out.println(mensaje);
         */
        while (intentos < LIMITE) {
            System.out.println("Dime un numero ");
            numerousuario = darnumero.nextInt();

            if (numerousuario == numerosecreto) {
                mensaje = "Has acertado";
                break;
            }
            intentos = intentos + 1;

        }

        System.out.println(mensaje);

    }

}
