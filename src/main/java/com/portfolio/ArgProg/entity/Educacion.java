
package com.portfolio.ArgProg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Educacion {
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
    private String titulo;

    @Lob
    private String imagen;

    public Educacion() {
    }

    public Educacion(String titulo, String imagen) {
        this.titulo = titulo;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
}
