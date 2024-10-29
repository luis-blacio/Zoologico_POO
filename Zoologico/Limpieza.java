import java.util.Date;

public class Limpieza extends Empleado {
    public Limpieza(String nombre, String telefono, Date fechaContratacion, String areaTrabajo) {
        super(nombre, telefono, fechaContratacion, areaTrabajo);
    }

    @Override
    public void realizarFuncion() {
        System.out.println("El empleado de limpieza " + nombre + " está limpiando el zoológico.");
    }
}
