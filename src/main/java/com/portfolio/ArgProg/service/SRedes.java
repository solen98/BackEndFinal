
package com.portfolio.ArgProg.service;

import com.portfolio.ArgProg.entity.Redes;
import com.portfolio.ArgProg.repository.RRedes;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SRedes {
    @Autowired
    public RRedes redRepo;
    

    public List<Redes> verRedes() {
       List<Redes> listaRedess = redRepo.findAll();
       return listaRedess;
    }
    
     public Redes buscarRedes(int id) {
        Redes red = redRepo.findById(id).orElse(null);
         return red;
    }
    
    public void crearRedes(Redes red){
        redRepo.save(red);
    }
    
    public void borrarRedes(int id) {
        redRepo.deleteById(id);
}
    public void editarRedes(Redes red){
        redRepo.save(red);
    }
}

