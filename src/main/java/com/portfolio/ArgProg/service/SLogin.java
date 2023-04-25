
package com.portfolio.ArgProg.service;

import com.portfolio.ArgProg.entity.Login;
import com.portfolio.ArgProg.repository.RLogin;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SLogin {
    @Autowired
    public RLogin entrarRepo;
    

    public List<Login> verLogin() {
       List<Login> listaLogin = entrarRepo.findAll();
       return listaLogin;
    }
    
     public Login buscarLogin(int id) {
        Login entrar = entrarRepo.findById(id).orElse(null);
         return entrar;
    }
    
    public void crearLogin(Login entrar){
        entrarRepo.save(entrar);
    }
    
    public void borrarLogin(int id) {
        entrarRepo.deleteById(id);
}
    public void editarLogin(Login entrar){
        entrarRepo.save(entrar);
    }

   
     public Login loginLogin(String email, String clave) {
        List <Login> entrar = entrarRepo.findByEmailAndClave(email, clave);
        if(!entrar.isEmpty()){
            
            return entrar.get(0); //si la lista no esta vacía ,devuelve la de la posición 0
        }
        return null;
    }
}

    
    
    

