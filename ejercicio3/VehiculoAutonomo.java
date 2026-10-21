package ejercicio3;
public class VehiculoAutonomo extends Sensor { 
    public static final String TIPO = "Vehiculo Autonomo";
    private Camara camara;
    private SensorLuzLaser sensorLaser;
    public VehiculoAutonomo(String id, String resolucion, int alcance) {
        super(id);
        camara = new Camara(id, resolucion);
        sensorLaser = new SensorLuzLaser(id, alcance);
    }

    public void activar() {
        super.activar();
        camara.activar();
        sensorLaser.activar();
    }

    public void desactivar() {
        super.desactivar();
        camara.desactivar();
        sensorLaser.desactivar();
    }

    public Camara getCamara() {
        return camara;
    }

    public SensorLuzLaser getSensorLaser() {
        return sensorLaser;
    }
}
