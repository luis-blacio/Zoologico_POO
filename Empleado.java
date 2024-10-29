import java.util.Date;

public abstract class Empleado extends Persona {
    protected Date fechaContratacion;
    protected String areaTrabajo;

    public Empleado(String nombre, String telefono, Date fechaContratacion, String areaTrabajo) {
        super(nombre, telefono);
        this.fechaContratacion = fechaContratacion;
        this.areaTrabajo = areaTrabajo;
    }

    public abstract void realizarFuncion();
}

