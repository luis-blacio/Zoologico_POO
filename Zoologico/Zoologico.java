import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String direccion;
    private List<Zona> zonas;
    private List<Empleado> empleados;

    public Zoologico(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.zonas = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public void agregarZona(Zona zona) {
        zonas.add(zona);
    }

    public void asignarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarZonas() {
        System.out.println("Zonas del Zoológico " + nombre + ":");
        for (Zona zona : zonas) {
            System.out.println("- " + zona.toString());
        }
    }
}
