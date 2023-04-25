
package com.portfolio.ArgProg.repository;

import com.portfolio.ArgProg.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository <Persona, Integer> {
    //public List<Persona> findByEmailAndClave(String email, String clave);
    
}
