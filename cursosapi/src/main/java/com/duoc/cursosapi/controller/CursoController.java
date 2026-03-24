package com.duoc.cursosapi.controller;


import com.duoc.cursosapi.model.Curso;
import com.duoc.cursosapi.service.CursoService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    private final CursoService cursoService;


    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    // Obtener
    @GetMapping
    public List<Curso> listarCursos(){
        return cursoService.obtenerCursos();
    }

    @GetMapping("/modalidades")
    public String[] listarModalidades(){
        return cursoService.obtenerModalidades();
    }

    @PostMapping
    public Curso agregarCurso(@Valid @RequestBody Curso curso){
        return cursoService.agregarCurso(curso);
    }

}
