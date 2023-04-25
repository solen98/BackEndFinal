
package com.portfolio.ArgProg.service;

import com.portfolio.ArgProg.entity.Softskill;
import com.portfolio.ArgProg.repository.RSoftskill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SSoftskill {
    @Autowired
    public RSoftskill softsRepo;
    

    public List<Softskill> verSoftskills() {
       List<Softskill> listaSoftskills = softsRepo.findAll();
       return listaSoftskills;
    }
    
     public Softskill buscarSoftskill(int id) {
        Softskill softs = softsRepo.findById(id).orElse(null);
         return softs;
    }
    
    public void crearSoftskill(Softskill softs){
        softsRepo.save(softs);
    }
    
    public void borrarSoftskill(int id) {
        softsRepo.deleteById(id);
}
    public void editarSoftskill(Softskill softs){
        softsRepo.save(softs);
    }
}
    

