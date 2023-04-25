
package com.portfolio.ArgProg.controller;

import com.portfolio.ArgProg.entity.Sobremi;
import com.portfolio.ArgProg.service.SSobremi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sobremi") //localhost:8080/yona
@CrossOrigin("http://localhost:4200") //direccion del frontend

public class CSobremi {
    @Autowired
    SSobremi yoServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Sobremi> verSobremis(){
        return yoServ.verSobremis();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
     public Sobremi verSobremi(@PathVariable int id){
        return yoServ.buscarSobremi(id);
    }
    
    @PostMapping ("/crear")
   public String agregarSobremi (@RequestBody Sobremi pers){
       yoServ.crearSobremi(pers);
       return "La persona fue creada correctamente";
    }
   
   @DeleteMapping ("/borrar/{id}")
   public String eliminarSobremi (@PathVariable int id){
       yoServ.borrarSobremi(id);
       return "La persona fue borrada correctamente";
   }
   
   //otra forma de editar la yona
   @PutMapping ("/update/{id}")
   public void updateSobremi(@RequestBody Sobremi pers) {
       yoServ.editarSobremi(pers);
   }
   
   @PostMapping ("/autenticacion/login")
    public Sobremi loginPersona (@RequestBody Sobremi pers) {
        return yoServ.loginPersona(pers.getCorreo(),pers.getContrasena());
        
    }
  
}
