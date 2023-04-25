
package com.portfolio.ArgProg.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String papa;
    private String caballo;

    public Persona() {
    }

    public Persona(String papa, String caballo) {
        this.papa = papa;
        this.caballo = caballo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPapa() {
        return papa;
    }

    public void setPapa(String papa) {
        this.papa = papa;
    }

    public String getCaballo() {
        return caballo;
    }
    
    public void setClave(String caballo) {
        this.caballo = caballo;
    }    
}
