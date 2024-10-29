import java.util.Date;
public class Main {
    public static void main(String[] args) {
        // Crear zoológico y administrador
        Zoologico zoologico = new Zoologico("Zoológico Central", "Av. Principal #123");
        Administrador admin = new Administrador("Carlos", "123456", "admin123");

        // Crear zonas y animales
        Zona zonaSelva = new Zona("Selva", "Sector A");
        zonaSelva.agregarAnimal(new Animal("Tigre", 5, "Selva"));
        zoologico.agregarZona(zonaSelva);

        // Crear empleados
        Veterinario veterinario = new Veterinario("Carlos Mendoza", "1234567890", new Date(), "Veterinaria", "Animales Salvajes");
        Limpieza limpieza = new Limpieza("Ana López", "0987654321", new Date(), "Limpieza");
        GuiaTuristico guia = new GuiaTuristico("Juan Pérez", "1122334455", new Date(), "Guías", "Español");

        // Asignar empleados al zoológico
        zoologico.asignarEmpleado(veterinario);
        zoologico.asignarEmpleado(limpieza);
        zoologico.asignarEmpleado(guia);

        // Mostrar información del zoológico
        zoologico.mostrarZonas();
    }
}
