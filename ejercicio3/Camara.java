
package ejercicio3;

public class Camara extends Sensor {

   
    public static final String TIPO = "Camara";

   
    private String resolucion;

    public Camara(String id, String resolucion) {
        super(id);
        this.resolucion = resolucion;
    }

    public String getResolucion() {
        return resolucion;
    }
}
