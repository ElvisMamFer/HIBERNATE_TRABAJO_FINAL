package com.educomser.entity;

import java.io.Serializable;

public class Direccion implements Serializable {

    private int id;
    private String calle;
    private String zona;
    private String nro;
    //---------------------------
    private  Profesor profesor;

  

    public Direccion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }
  public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    @Override
    public String toString() {
        return "Direccion{" + "id=" + id + ", calle=" + calle + ", zona=" + zona + ", nro=" + nro + '}';
    }
    
    

}
