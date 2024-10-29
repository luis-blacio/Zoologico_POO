public class Administrador extends Persona {
    private String contrasena;

    public Administrador(String nombre, String telefono, String contrasena) {
        super(nombre, telefono);
        this.contrasena = contrasena;
    }

    public void gestionarEmpleado(Empleado empleado) {
        System.out.println("Administrador gestionando empleado: " + empleado.getNombre());
    }
}
