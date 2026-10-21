
package ejercicio2;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }

    @Override
    public boolean validaNumero(int numero) {

        if (numero < 0 || numero > 10 || numero % 2 != 0) {
            System.out.println("Error: debes introducir un numero par entre 0 y 10.");
            return false;
        }

        return true;
    }

    @Override
    protected int generaNumeroAdivinar() {
        int[] pares = {0, 2, 4, 6, 8, 10};
        return pares[(int) (Math.random() * pares.length)];
    }
}
