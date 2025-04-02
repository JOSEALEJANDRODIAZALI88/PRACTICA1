package com.PRACTICA1.repository;

import com.PRACTICA1.model.Estudiante;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EstudianteRepository {
    private final List<Estudiante> estudiantes = new ArrayList<>();

    public List<Estudiante> findAll() {
        return estudiantes;
    }

    public Optional<Estudiante> findById(int id) {
        return estudiantes.stream().filter(e -> e.getId() == id).findFirst();
    }

    public void save(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void deleteById(int id) {
        estudiantes.removeIf(e -> e.getId() == id);
    }
}
