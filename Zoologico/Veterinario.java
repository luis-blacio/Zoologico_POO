import java.util.Date;

public class Veterinario extends Empleado {
    private String especialidad;

    public Veterinario(String nombre, String telefono, Date fechaContratacion, String areaTrabajo, String especialidad) {
        super(nombre, telefono, fechaContratacion, areaTrabajo);
        this.especialidad = especialidad;
    }

    @Override
    public void realizarFuncion() {
        System.out.println("El veterinario " + nombre + " está atendiendo animales.");
    }
}
