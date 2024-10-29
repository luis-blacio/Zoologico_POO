import java.util.Date;

public class GuiaTuristico extends Empleado {
    private String idioma;

    public GuiaTuristico(String nombre, String telefono, Date fechaContratacion, String areaTrabajo, String idioma) {
        super(nombre, telefono, fechaContratacion, areaTrabajo);
        this.idioma = idioma;
    }

    @Override
    public void realizarFuncion() {
        System.out.println("El guía turístico " + nombre + " está realizando un tour en " + idioma + ".");
    }
}
