public class Cliente extends Persona {
    private String correoElectronico;

    public Cliente(String nombre, String telefono, String correoElectronico) {
        super(nombre, telefono);
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }
}

