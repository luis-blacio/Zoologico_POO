import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Saludar al usuario
        System.out.println("¡Bienvenido al Zoológico Central!");

        // 2. Indicar que debe comprar un ticket
        System.out.println("Debe comprar un ticket para ingresar al zoológico.");

        // 3. Validar el ticket
        int ticketGenerado = generarTicket();
        System.out.println("Por favor, ingrese el número del ticket para validar su entrada:");
        int ticketIngresado = scanner.nextInt();

        while (ticketIngresado != ticketGenerado) {
            System.out.println("Ticket inválido. Intente nuevamente:");
            ticketIngresado = scanner.nextInt();
        }

        System.out.println("¡Ticket validado con éxito!");

        // 4. Preguntar si el usuario desea un tour o explorar por su cuenta
        System.out.println("¿Desea un tour turístico guiado por el zoológico o desea explorar por su cuenta?");
        System.out.println("Escriba '1' para Tour Turístico o '2' para Explorar por su cuenta:");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("¡Ha seleccionado el Tour Turístico! Un guía lo acompañará en su visita.");
            realizarTour();
        } else if (opcion == 2) {
            System.out.println("¡Ha seleccionado explorar por su cuenta! Disfrute del zoológico.");
            explorarPorCuenta();
        } else {
            System.out.println("Opción no válida. Finalizando programa.");
        }

        scanner.close();
    }

    // Método para generar un número aleatorio como ticket
    public static int generarTicket() {
        Random random = new Random();
        int ticket = random.nextInt(9000) + 1000; // Genera un ticket entre 1000 y 9999
        System.out.println("Su número de ticket es: " + ticket);
        return ticket;
    }

    // Método para realizar el tour
    public static void realizarTour() {
        // Simulando el tour con un mensaje, aquí puedes agregar más detalles del recorrido.
        System.out.println("El guía está mostrando las zonas y los animales del zoológico.");
    }

    // Método para explorar el zoológico por cuenta propia
    public static void explorarPorCuenta() {
        // Simulando la exploración por cuenta propia, podrías agregar más interactividad aquí.
        System.out.println("Explorando el zoológico por su cuenta. Hay muchas zonas para ver.");
    }
}

