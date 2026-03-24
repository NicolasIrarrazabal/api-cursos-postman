package com.duoc.cursosapi.service;
import com.duoc.cursosapi.model.Curso;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {
    private List<Curso> listarCursos = new ArrayList<Curso>();

    private String[] modalidades = {"Presecial", "Online", "Hibrdo"};

    public CursoService() {
        listarCursos.add(new Curso(1,"Fullstack I","Marcelo Crisostomo",100));
        listarCursos.add(new Curso(2,"Base de Datos","German Barrientos",120));
        listarCursos.add(new Curso(3,"Inteligencia Artificial","Gio",150));
    }

    public List<Curso> obtenerCursos(){
        return listarCursos;
    }

    public String[] obtenerModalidades(){
        return modalidades;
    }

    public Curso agregarCurso(Curso curso){
        listarCursos.add(curso);
        return curso;
    }
}
