import java.util.ArrayList;
import java.util.List;

public class Zona {
    private String nombre;
    private String ubicacion;
    private List<Animal> animales;

    public Zona(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }

    public void mostrarAnimales() {
        System.out.println("Animales en la zona " + nombre + ":");
        for (Animal animal : animales) {
            System.out.println("- " + animal.getEspecie());
        }
    }

    // Método getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Método getter para ubicacion
    public String getUbicacion() {
        return ubicacion;
    }
}
