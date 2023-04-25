
package com.portfolio.ArgProg.service;

import com.portfolio.ArgProg.entity.Hardskill;
import com.portfolio.ArgProg.repository.RHardskill;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class SHardskill {
    @Autowired
    public RHardskill hardsRepo;
    

    public List<Hardskill> verHardskills() {
       List<Hardskill> listaHardskills = hardsRepo.findAll();
       return listaHardskills;
    }
    
     public Hardskill buscarHardskill(int id) {
        Hardskill hards = hardsRepo.findById(id).orElse(null);
         return hards;
    }
    
    public void crearHardskill(Hardskill hards){
        hardsRepo.save(hards);
    }
    
    public void borrarHardskill(int id) {
        hardsRepo.deleteById(id);
}
    public void editarHardskill(Hardskill hards){
        hardsRepo.save(hards);
    }
}
