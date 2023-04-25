
package com.portfolio.ArgProg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Redes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int id;
    private String link;
    private String icono;

    public Redes() {
    }

    public Redes(String link, String icono) {
        this.link = link;
        this.icono = icono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }
   
    
    
}
