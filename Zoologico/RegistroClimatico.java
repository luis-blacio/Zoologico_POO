import java.util.Date;

public class RegistroClimatico {
    private Date fecha;
    private float temperatura;
    private float humedad;

    public RegistroClimatico(Date fecha, float temperatura, float humedad) {
        this.fecha = fecha;
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    public void mostrarRegistro() {
        System.out.println("Registro climático del " + fecha + ": Temp = " + temperatura + ", Humedad = " + humedad);
    }
}
