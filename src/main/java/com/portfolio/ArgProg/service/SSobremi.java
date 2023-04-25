
package com.portfolio.ArgProg.service;

import com.portfolio.ArgProg.entity.Sobremi;
import com.portfolio.ArgProg.repository.RSobremi;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSobremi {
    @Autowired
    public RSobremi yoRepo;
    

    public List<Sobremi> verSobremis() {
       List<Sobremi> listaSobremis = yoRepo.findAll();
       return listaSobremis;
    }
    
     public Sobremi buscarSobremi(int id) {
        Sobremi yo = yoRepo.findById(id).orElse(null);
         return yo;
    }
    
    public void crearSobremi(Sobremi yo){
        yoRepo.save(yo);
    }
    
    public void borrarSobremi(int id) {
        yoRepo.deleteById(id);
}
    public void editarSobremi(Sobremi yo){
        yoRepo.save(yo);
    }
    
    
    public Sobremi loginPersona(String correo, String clave) {
        List <Sobremi> personas = yoRepo.findByCorreoAndContrasena(correo, clave);
        
        if(!personas.isEmpty()){
            return personas.get(0);                        
        }
        return null;
    }          
        
}

    