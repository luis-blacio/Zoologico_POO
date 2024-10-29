# Zoologico_POO

# Docente de la materia:
Ing. Edison Coronel.

# Los integrantes del grupo son: 
- Tayron Morales.
- Mathias Medina. 
- Santiago Villamagua.
- Leonardo Sánchez.
- Luis Blacio.

# Descripción 
El siguiente diagrama de clases continen los siguientes requerimientos:
Modelo UML completo para un Zoológico

**1. Persona**
Atributos:

-nombre: String

-cedula: String

-fechaNacimiento: Date

Operaciones:

+calcularEdad(): int


**2. Cliente (hereda de Persona)**

Atributos:

-tipoCliente: String (ej. "individual", "grupo", "miembro anual")

Operaciones:

+solicitarBoleto(): Boleto

Conexión:

1.. relación* con Boleto (un cliente puede tener múltiples boletos).


**3. Visitante (hereda de Persona)**

Atributos:

-tipoVisitante: String (ej. "niño", "adulto", "mayor")

Operaciones:

+comprarBoleto(tipo: String): Boleto

Conexión:

1.. relación* con Boleto (un visitante puede tener múltiples boletos).


**4. Limpieza**

Atributos:

horario: Time (paquete)

-zonaAsignada: String

Operaciones:

+asignarLimpieza(zona: String): void


**5. Administración**

Atributos:

-nombre: String

-cargo: String

Operaciones:

+gestionarEmpleado(): void

+revisarInventario(): void


**6. Veterinaria**

Atributos:

-nombreVeterinario: String

-especialidad: String

Operaciones:

+revisarAnimal(idAnimal: int): void

+recetarTratamiento(idAnimal: int): String

Conexión:

1.. relación* con RegistroMedico (un veterinario puede crear múltiples registros médicos).


**7. Zoologico**

Atributos:

-nombre: String

-ubicacion: String

Operaciones:

+abrirZoologico(): void

+cerrarZoologico(): void


**8. MedidasDeSeguridad**

Atributos:

-nivelDeRiesgo: String

-descripcion: String

Operaciones:

+inspeccionarSeguridad(): void


**9. TamanoZoologico**

Atributos:

metrosCuadrados: Double (paquete)

Operaciones:

+calcularCapacidadMaxima(): int


**10. Boleto**

Atributos:

-tipo: String (ej. "diario", "anual", "VIP")

-precio: Double

-fechaExpedicion: Date

Operaciones:

+calcularDescuento(tipoCliente: String): Double


**11. GuiaTuristico**

Atributos:

-nombre: String

-idioma: String

Operaciones:

+realizarTour(horario: String): void

Conexión:

1.. relación* con Itinerario (un guía puede tener varios itinerarios).


**12. Itinerario**

Atributos:

horarioVisita: String (paquete)

duracion: Double (paquete)

-zonaAsignada: String

Operaciones:

+calcularDuracionTotal(): Double

Conexión:

1.. relación* con GuiaTuristico (un guía puede tener varios itinerarios).


**13. Animales**

Atributos:

idAnimal: int (paquete)

-nombre: String

-edad: int

Operaciones:

+comer(): void

+dormir(): void

Conexiones:

1.. relación* con Habitat (un animal vive en un hábitat específico).

1.. relación* con RegistroMedico (cada animal puede tener varios registros médicos).


**14. TiposDeAnimales (clase base)**

Sin atributos ni operaciones específicas, pero actúa como base para los tipos específicos de alimentación de animales.

Conexiones:

Relación de herencia con las clases de alimentación de animales.


**15. AlimentoQueConsumen (clase abstracta para categorías de alimentación)**

Clases derivadas:

Omnivoros (ej. mapache, oso)

Carroñeros (ej. buitre, hiena)

Carnivoros (ej. tigre, león)

Herbivoros (ej. elefante, jirafa)


**16. Habitat**

Atributos:

tipoHabitat: String (paquete)

-temperatura: Double

-humedad: Double

Operaciones:

+ajustarCondiciones(temperatura: Double, humedad: Double): void

Conexión:

1.. relación* con Animales (un hábitat puede tener varios animales).


**17. Inventario**

Atributos:

nombreArticulo: String (paquete)

-cantidad: int

-ubicacion: String

Operaciones:

+actualizarStock(nuevaCantidad: int): void

+consultarInventario(): String


**Conexiones:**

1.. relación* con Administracion (la administración puede revisar y gestionar el inventario).

Conexiones y Multiplicidades

Persona se extiende en Cliente y Visitante.

Cliente y Visitante tienen relación 1..* con Boleto (cada cliente o visitante puede adquirir varios boletos).

GuiaTuristico tiene relación 1..* con Itinerario.

Animales tiene relación 1..* con RegistroMedico y 1..* con Habitat.

Veterinaria tiene relación 1..* con RegistroMedico.

Inventario tiene relación 1..* con Administracion.

TiposDeAnimales se divide en Omnivoros, Carroñeros, Carnivoros, y Herbivoros.


# Diagrma en UML

![image](https://github.com/user-attachments/assets/6ada0ba7-80a9-4896-a9ba-16ca4064138e)


# Diagrama en base a GitFlow
![image](https://github.com/user-attachments/assets/3f2fa7b5-92e4-4db9-a8f8-85cd4e00d199)


https://app.diagrams.net/#HTayron2024%2FTrabajos-de-la-Universidad%2Fmain%2FDiagrama%20Zoologico#%7B"pageId"%3A"c7488fd3-1785-93aa-aadb-54a6760d102a"%7D













# Codigo en Java

https://github.com/luis-blacio/Zoologico_POO/tree/main/Zoologico

https://github.com/luis-blacio/Zoologico_POO/blob/main/clases.pdf

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


