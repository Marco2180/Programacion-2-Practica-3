
package ejercicio1;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

    private int numeroAdivinar;
    private static final Scanner teclado = new Scanner(System.in);

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }

    public void juega() {

        reiniciaPartida();

        numeroAdivinar = (int) (Math.random() * 11);

        System.out.println("Adivina el numero entre 0 y 10");

        while (numeroDeVidas > 0) {

            System.out.print("Introduce un numero: ");
            int numero = teclado.nextInt();

            if (numero == numeroAdivinar) {

                System.out.println("Acertaste!");
                actualizaRecord();
                break;

            } else {

                boolean quedanVidas = quitaVida();

                if (quedanVidas) {

                    if (numero < numeroAdivinar) {
                        System.out.println("El numero es mayor");
                    } else {
                        System.out.println("El numero es menor");
                    }

                    System.out.println("Intenta de nuevo");

                } else {

                    System.out.println("Te quedaste sin vidas.");
                    System.out.println("El numero era: " + numeroAdivinar);
                    break;
                }
            }
        }
    }
}

