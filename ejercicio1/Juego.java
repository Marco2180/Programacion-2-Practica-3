package ejercicio1;

public class Juego {

    protected int numeroDeVidas;
    protected int record;

   

public Juego() {
    this(5);
}

public Juego(int vidas) {
    numeroDeVidas = vidas;
    record = 0;
}


   
    public void reiniciaPartida() {
        numeroDeVidas = 5;
    }

  
    public void actualizaRecord() {
        record++;
        System.out.println("Record actualizado: " + record);
    }

    
    public boolean quitaVida() {
        numeroDeVidas--;

        System.out.println("Vidas restantes: " + numeroDeVidas);

        return numeroDeVidas > 0;
    }
}
