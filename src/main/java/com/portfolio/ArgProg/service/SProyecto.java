
package com.portfolio.ArgProg.service;


import com.portfolio.ArgProg.entity.Proyectos;
import com.portfolio.ArgProg.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    @Autowired
    public RProyecto proyeRepo;
    

    public List<Proyectos> verProyectos() {
       List<Proyectos> listaProyectos = proyeRepo.findAll();
       return listaProyectos;
    }
    
     public Proyectos buscarProyecto(int id) {
        Proyectos proye = proyeRepo.findById(id).orElse(null);
         return proye;
    }
    
    public void crearProyecto(Proyectos proye){
        proyeRepo.save(proye);
    }
    
    public void borrarProyecto(int id) {
        proyeRepo.deleteById(id);
}
    public void editarProyecto(Proyectos proye){
        proyeRepo.save(proye);
    }
    
}
