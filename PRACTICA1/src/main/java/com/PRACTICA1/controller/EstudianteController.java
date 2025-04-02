package com.PRACTICA1.controller;
import com.PRACTICA1.model.Estudiante;
import com.PRACTICA1.dto.EstudianteDTO;
import com.PRACTICA1.service.EstudianteService;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    // Crear estudiante
    @PostMapping
    public ResponseEntity<Estudiante> crearEstudiante(@RequestBody EstudianteDTO estudianteDTO) {
        Estudiante nuevoEstudiante = estudianteService.crearEstudiante(estudianteDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoEstudiante);
    }

    // Obtener todos los estudiantes
    @GetMapping
    public List<Estudiante> obtenerTodos() {
        return estudianteService.obtenerTodos();
    }

    // Obtener estudiante por ID
    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> obtenerEstudiante(@PathVariable Long id) {
        return estudianteService.obtenerEstudiante(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Actualizar estudiante
    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> actualizarEstudiante(@PathVariable Long id, @RequestBody EstudianteDTO estudianteDTO) {
        return estudianteService.actualizarEstudiante(id, estudianteDTO)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Eliminar estudiante
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEstudiante(@PathVariable Long id) {
        return estudianteService.eliminarEstudiante(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
