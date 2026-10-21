
package ejercicio3;

public class SensorLuzLaser extends Sensor {

   
    public static final String TIPO = "Luz Laser";

    
    private int alcance;

    public SensorLuzLaser(String id, int alcance) {
        super(id);
        this.alcance = alcance;
    }

    public int getAlcance() {
        return alcance;
    }
}
