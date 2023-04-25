
package com.portfolio.ArgProg.service;

import com.portfolio.ArgProg.entity.Educacion;
import com.portfolio.ArgProg.repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SEducacion {
    @Autowired
    public REducacion educaRepo;
    

    public List<Educacion> verEducacions() {
       List<Educacion> listaEducacions = educaRepo.findAll();
       return listaEducacions;
    }
    
     public Educacion buscarEducacion(int id) {
        Educacion educa = educaRepo.findById(id).orElse(null);
         return educa;
    }
    
    public void crearEducacion(Educacion educa){
        educaRepo.save(educa);
    }
    
    public void borrarEducacion(int id) {
        educaRepo.deleteById(id);
}
    public void editarEducacion(Educacion educa){
        educaRepo.save(educa);
    }
}
