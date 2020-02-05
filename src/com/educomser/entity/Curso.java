package com.educomser.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class Curso implements Serializable {

    private int id;
    private String descripcion;
    private double costo;
    private Date fechainicion;
    //---------------------------
    private Profesor profesor;
    private Set<Estudiante> estudiantes;

    public Curso() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFechainicion() {
        return fechainicion;
    }

    public void setFechainicion(Date fechainicion) {
        this.fechainicion = fechainicion;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Set<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Set<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", descripcion=" + descripcion + ", costo=" + costo + ", fechainicion=" + fechainicion + ", profesor=" + profesor + ", estudiantes=" + estudiantes + '}';
    }
   
  
}
