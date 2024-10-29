public class Animal {
    private String especie;
    private int edad;
    private String habitat;

    public Animal(String especie, int edad, String habitat) {
        this.especie = especie;
        this.edad = edad;
        this.habitat = habitat;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public String getHabitat() {
        return habitat;
    }
}
