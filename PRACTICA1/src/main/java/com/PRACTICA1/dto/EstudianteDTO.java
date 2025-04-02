package com.PRACTICA1.dto;

public class EstudianteDTO {
    private String nombre;
    private int edad;
    private String carrera;

    // Constructor vacío
    public EstudianteDTO() {}

    // Constructor con parámetros
    public EstudianteDTO(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
}
