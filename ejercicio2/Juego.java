
package ejercicio2;

public class Juego {

    protected int numeroDeVidas;
    protected int record;
    protected int vidasIniciales;

    public Juego() {
        this(5);
    }

    public Juego(int vidas) {
        vidasIniciales = vidas;
        numeroDeVidas = vidas;
        record = 0;
    }

    public void reiniciaPartida() {
        numeroDeVidas = vidasIniciales;
    }

    public void actualizaRecord() {
        record++;
        System.out.println("Record: " + record);
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        System.out.println("Vidas restantes: " + numeroDeVidas);
        return numeroDeVidas > 0;
    }
}