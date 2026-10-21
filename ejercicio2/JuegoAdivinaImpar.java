
package ejercicio2;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaImpar(int vidas) {
        super(vidas);
    }

    @Override
    public boolean validaNumero(int numero) {

        if (numero < 0 || numero > 10 || numero % 2 == 0) {
            System.out.println("Error: debes introducir un numero impar entre 0 y 10.");
            return false;
        }

        return true;
    }

    @Override
    protected int generaNumeroAdivinar() {
        int[] impares = {1, 3, 5, 7, 9};
        return impares[(int) (Math.random() * impares.length)];
    }
}

