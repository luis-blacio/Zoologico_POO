# Zoologico_POO

# Docente de la materia:
Ing. Edison Coronel.

# Los integrantes del grupo son: 
- Tayron Morales.
- Mathias Medina. 
- Santiago Villamagua.
- Leonardo Sánchez.
- Luis Blacio.

# Codigo en Java

## Main

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

## Clase Administraccion

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


## Clase Zoologico

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String direccion;
    private List<Zona> zonas;
    private List<Empleado> empleados;

    public Zoologico(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.zonas = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public void agregarZona(Zona zona) {
        zonas.add(zona);
    }

    public void asignarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarZonas() {
        System.out.println("Zonas del Zoológico " + nombre + ":");
        for (Zona zona : zonas) {
            System.out.println("- " + zona);
        }
    }
}

## Clase Animal

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

## Clase Zona

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
}

## Clase RegistroClimatico


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

## Clase GuiaTuristica

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

## Clase Limpieza

import java.util.Date;

public class Limpieza extends Empleado {
    public Limpieza(String nombre, String telefono, Date fechaContratacion, String areaTrabajo) {
        super(nombre, telefono, fechaContratacion, areaTrabajo);
    }

    @Override
    public void realizarFuncion() {
        System.out.println("El empleado de limpieza " + nombre + " está limpiando el zoológico.");
    }
}

## Clase Veterinario

import java.util.Date;

public class Veterinario extends Empleado {
    private String especialidad;

    public Veterinario(String nombre, String telefono, Date fechaContratacion, String areaTrabajo, String especialidad) {
        super(nombre, telefono, fechaContratacion, areaTrabajo);
        this.especialidad = especialidad;
    }

    @Override
    public void realizarFuncion() {
        System.out.println("El veterinario " + nombre + " está atendiendo animales.");
    }
}

## Clase Empleado

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

# UML imagen
![image](https://github.com/user-attachments/assets/6ada0ba7-80a9-4896-a9ba-16ca4064138e)

# Descripción 
El siguiente diagrama de clases continen los siguientes requerimientos:
