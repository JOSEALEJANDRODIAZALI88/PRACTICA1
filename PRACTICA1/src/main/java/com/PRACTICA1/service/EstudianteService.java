
package com.PRACTICA1.service;
import com.PRACTICA1.model.Estudiante;
import com.PRACTICA1.dto.EstudianteDTO;
import com.PRACTICA1.service.EstudianteService;



import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {
    private final List<Estudiante> estudiantes = new ArrayList<>();
    private Long idCounter = 1L; // Generador de ID

    // Crear estudiante
    public Estudiante crearEstudiante(EstudianteDTO estudianteDTO) {
        Estudiante estudiante = new Estudiante(idCounter++, estudianteDTO.getNombre(), estudianteDTO.getEdad(), estudianteDTO.getCarrera());
        estudiantes.add(estudiante);
        return estudiante;
    }

    // Obtener estudiante por ID
    public Optional<Estudiante> obtenerEstudiante(Long id) {
        return estudiantes.stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    // Obtener todos los estudiantes
    public List<Estudiante> obtenerTodos() {
        return estudiantes;
    }

    // Actualizar estudiante
    public Optional<Estudiante> actualizarEstudiante(Long id, EstudianteDTO estudianteDTO) {
        return obtenerEstudiante(id).map(estudiante -> {
            estudiante.setNombre(estudianteDTO.getNombre());
            estudiante.setEdad(estudianteDTO.getEdad());
            estudiante.setCarrera(estudianteDTO.getCarrera());
            return estudiante;
        });
    }

    // Eliminar estudiante
    public boolean eliminarEstudiante(Long id) {
        return estudiantes.removeIf(e -> e.getId().equals(id));
    }
}
