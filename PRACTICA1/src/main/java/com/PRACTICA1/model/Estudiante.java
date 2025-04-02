package com.PRACTICA1.model;

public class Estudiante {
    private Long id;
    private String nombre;
    private int edad;
    private String carrera;

    // Constructor vacío
    public Estudiante() {}

    // Constructor con parámetros
    public Estudiante(Long id, String nombre, int edad, String carrera) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
}


