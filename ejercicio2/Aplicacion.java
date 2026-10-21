
package ejercicio2;

public class Aplicacion {

    public static void main(String[] args) {

        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

        System.out.println("JUEGO 1: ADIVINA UN NUMERO");
        juego1.juega();

        System.out.println("\nJUEGO 2: ADIVINA UN NUMERO PAR");
        juego2.juega();

        System.out.println("\nJUEGO 3: ADIVINA UN NUMERO IMPAR");
        juego3.juega();

        System.out.println("\nFin de los juegos.");
    }
}
