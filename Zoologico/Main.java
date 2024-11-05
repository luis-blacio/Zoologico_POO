import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saludo inicial
        System.out.println("¡Bienvenido al Zoológico Primal!");

        // Crear zoológico, administrador y zonas
        Zoologico zoologico = new Zoologico("Zoológico Primal", "Av. Principal #123");
        Administrador admin = new Administrador("Carlos", "123456", "admin123");

        // Crear zonas y animales
        Zona zonaSelva = new Zona("Selva", "Sector A");
        zonaSelva.agregarAnimal(new Animal("Tigre", 5, "Selva"));
        Zona zonaAcuatica = new Zona("Acuática", "Sector B");
        zonaAcuatica.agregarAnimal(new Animal("Delfín", 8, "Océano"));

        zoologico.agregarZona(zonaSelva);
        zoologico.agregarZona(zonaAcuatica);

        // Crear empleados
        Veterinario veterinario = new Veterinario("Carlos Mendoza", "1234567890", new Date(), "Veterinaria", "Animales Salvajes");
        Limpieza limpieza = new Limpieza("Ana López", "0987654321", new Date(), "Limpieza");
        GuiaTuristico guia = new GuiaTuristico("Juan Pérez", "1122334455", new Date(), "Guías", "Español");

        // Asignar empleados al zoológico
        zoologico.asignarEmpleado(veterinario);
        zoologico.asignarEmpleado(limpieza);
        zoologico.asignarEmpleado(guia);

        // Solicitar compra de ticket
        System.out.println("Para ingresar al zoológico, necesita comprar un ticket. ¿Desea comprar uno? (si/no): ");
        String respuesta = scanner.nextLine();

        if (!respuesta.equalsIgnoreCase("si")) {
            System.out.println("Gracias por su interés. ¡Vuelva pronto!");
            scanner.close();
            return; // Termina el programa si el usuario no desea comprar un ticket
        }

        // Validar el ticket (simulación de número de ticket aleatorio)
        int ticketNumero = (int) (Math.random() * 1000) + 1;
        System.out.println("Su número de ticket es: " + ticketNumero);

        // Preguntar si el usuario desea un tour guiado o libre
        System.out.println("¿Desea recibir un tour guiado? (si/no): ");
        String deseaTourGuiado = scanner.nextLine();

        if (deseaTourGuiado.equalsIgnoreCase("si")) {
            System.out.println("El guía " + guia.getNombre() + " le llevará en un tour por el zoológico.");
            mostrarTour(zoologico);
        } else {
            System.out.println("Puede explorar el zoológico por su cuenta. ¡Disfrute su visita!");
            mostrarTour(zoologico);
        }

        // Mostrar funciones de los empleados (ejemplo)
        System.out.println("\nFunciones de los empleados:");
        veterinario.realizarFuncion();
        limpieza.realizarFuncion();
        guia.realizarFuncion();

        scanner.close();
    }

    // Método para mostrar el tour por el zoológico
    public static void mostrarTour(Zoologico zoologico) {
        System.out.println("\nZonas del Zoológico " + zoologico.getNombre() + ":");
        for (Zona zona : zoologico.getZonas()) {
            System.out.println("- Zona: " + zona.getNombre() + " (Ubicación: " + zona.getUbicacion() + ")");
            zona.mostrarAnimales();
        }
    }
}
