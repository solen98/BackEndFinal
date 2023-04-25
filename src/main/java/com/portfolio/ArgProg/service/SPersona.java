
package com.portfolio.ArgProg.service;

import com.portfolio.ArgProg.entity.Persona;
import com.portfolio.ArgProg.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
    @Autowired
    public RPersona persoRepo;
    

    public List<Persona> verPersonas() {
       List<Persona> listaPersonas = persoRepo.findAll();
       return listaPersonas;
    }
    
     public Persona buscarPersona(int id) {
        Persona perso = persoRepo.findById(id).orElse(null);
         return perso;
    }
    
    public void crearPersona(Persona perso){
        persoRepo.save(perso);
    }
    
    public void borrarPersona(int id) {
        persoRepo.deleteById(id);
}
    public void editarPersona(Persona perso){
        persoRepo.save(perso);
    }

   
    // public Persona loginPersona(String email, String clave) {
      //  List <Persona> personas = persoRepo.findByEmailAndClave(email, clave);
        //if(!personas.isEmpty()){
          //  return personas.get(0); //si la lista no esta vacía ,e devuelve la de la posición 0
        //}
        //return null;
    //}
    
    }
    
    
    



