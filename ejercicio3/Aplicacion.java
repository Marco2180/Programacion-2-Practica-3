
package ejercicio3;

public class Aplicacion {

    public static void main(String[] args) {

        VehiculoAutonomo vehiculo =
                new VehiculoAutonomo("V001", "4K", 100);

        System.out.println("Sistema de Vehiculo Autonomo");
        System.out.println("ID: " + vehiculo.getId());
        System.out.println("Tipo: " + VehiculoAutonomo.TIPO);
        System.out.println("Resolucion: "
                + vehiculo.getCamara().getResolucion());
        System.out.println("Alcance: "
                + vehiculo.getSensorLaser().getAlcance());

        System.out.println("\nActivando el sistema:");
        vehiculo.activar();

        System.out.println("\nEstado del sensor: "
                + vehiculo.isEncendido());
        System.out.println("Estado de la camara: "
                + vehiculo.getCamara().isEncendido());
        System.out.println("Estado del laser: "
                + vehiculo.getSensorLaser().isEncendido());

        System.out.println("\nDesactivando el sistema:");
        vehiculo.desactivar();
    }
}
