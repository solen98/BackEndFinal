
package com.portfolio.ArgProg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Sobremi {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String acercademi1;
    private String acercademi2;
    private String acercademi3;
    private String acercademi4;
    private String correo;
    private String contrasena;
    
       @Lob
    private String imagen;
       
       

    public Sobremi() {
    }

    public Sobremi(String imagen, String acercademi1, String acercademi2, String acercademi3, String acercademi4, String correo, String contrasena) {
        this.acercademi1 = acercademi1;
        this.acercademi2 = acercademi2;
        this.acercademi3 = acercademi3;
        this.acercademi4 = acercademi4;
        this.correo = correo;
        this.contrasena = contrasena;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen (String imagen) {
        this.imagen = imagen;
    }

    public String getAcercademi1() {
        return acercademi1;
    }

    public void setAcercademi1(String acercademi1) {
        this.acercademi1 = acercademi1;
    }

    public String getAcercademi2() {
        return acercademi2;
    }

    public void setAcercademi2(String acercademi2) {
        this.acercademi2 = acercademi2;
    }

    public String getAcercademi3() {
        return acercademi3;
    }

    public void setAcercademi3(String acercademi3) {
        this.acercademi3 = acercademi3;
    }

    public String getAcercademi4() {
        return acercademi4;
    }

    public void setAcercademi4(String acercademi4) {
        this.acercademi4 = acercademi4;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
