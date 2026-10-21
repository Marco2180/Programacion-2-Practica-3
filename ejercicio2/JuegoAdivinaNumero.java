
package ejercicio2;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

    protected int numeroAdivinar;
    protected static final Scanner teclado = new Scanner(System.in);

    public JuegoAdivinaNumero(int vidas) {
        super(vidas);
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    protected int generaNumeroAdivinar() {
        return (int) (Math.random() * 11);
    }

    public void juega() {

        reiniciaPartida();
        numeroAdivinar = generaNumeroAdivinar();

        System.out.println("\nAdivina el numero entre 0 y 10");

        while (numeroDeVidas > 0) {

            System.out.print("Introduce un numero: ");
            int numero = teclado.nextInt();

            if (!validaNumero(numero)) {
                System.out.println("Error: introduce un numero entre 0 y 10.");
                continue;
            }

            if (numero == numeroAdivinar) {

                System.out.println("Acertaste!");
                actualizaRecord();
                return;

            } else {

                boolean quedanVidas = quitaVida();

                if (quedanVidas) {

                    if (numero < numeroAdivinar) {
                        System.out.println("El numero es mayor.");
                    } else {
                        System.out.println("El numero es menor.");
                    }

                } else {

                    System.out.println("Te quedaste sin vidas.");
                    System.out.println("El numero era: " + numeroAdivinar);
                }
            }
        }
    }
}
