package com.educomser.entity;

import java.io.Serializable;
import java.util.Date;

public class Profesor implements Serializable {

    private int id;
    private String ci;
    private String nombre;
    private String paterno;
    private String telefono;
    private double sueldo;
    //----------------------------
    private Direccion direccion;

    public Profesor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", ci=" + ci + ", nombre=" + nombre + ", paterno=" + paterno + ", telefono=" + telefono + ", sueldo=" + sueldo + ", direccion=" + direccion + '}';
    }
    
     
       
}
