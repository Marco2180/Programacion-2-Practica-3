
package ejercicio3;

public class Sensor {

    
    public static final String TIPO = "Generico";

    
    protected String id;
    protected boolean encendido;

    public Sensor(String id) {
        this.id = id;
        this.encendido = false;
    }

    public void activar() {
        encendido = true;
        System.out.println("Sensor " + id + " activado");
    }

    public void desactivar() {
        encendido = false;
        System.out.println("Sensor " + id + " desactivado");
    }

    public String getId() {
        return id;
    }

    public boolean isEncendido() {
        return encendido;
    }
}
