package com.duoc.cursosapi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Curso {
    @NotNull(message = "El id no puede ser nulo.")
    private Integer id;

    //validacion
    @NotBlank(message = "Nombre no puede estar en blanco.")
    private String nombre;

    @NotBlank(message = "Nombre no puede estar en blanco ni contener espacios.")
    private String docente;

    @NotNull
    private int horasCurso;

    public Curso() {
    }

    public Curso(Integer id, String nombre, String docente, int horasCurso) {
        this.id = id;
        this.nombre = nombre;
        this.docente = docente;
        this.horasCurso = horasCurso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getHorasCurso() {
        return horasCurso;
    }

    public void setHorasCurso(int horasCurso) {
        this.horasCurso = horasCurso;
    }
}
