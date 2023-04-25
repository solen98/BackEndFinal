
package com.portfolio.ArgProg.controller;

import com.portfolio.ArgProg.entity.Persona;
import com.portfolio.ArgProg.service.SPersona;
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
@RequestMapping("persona") //localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200") //direccion del frontend
public class CPersona {
    
    @Autowired
    SPersona persoServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
     public Persona verPersona(@PathVariable int id){
        return persoServ.buscarPersona(id);
    }
    
    @PostMapping ("/crear")
   public String agregarPersona (@RequestBody Persona pers){
       persoServ.crearPersona(pers);
       return "La persona fue creada correctamente";
    }
   
   @DeleteMapping ("/borrar/{id}")
   public String eliminarPersona (@PathVariable int id){
       persoServ.borrarPersona(id);
       return "La persona fue borrada correctamente";
   }
   
   //otra forma de editar la persona
   @PutMapping ("/update")
   public void updatePersona(@RequestBody Persona pers) {
       persoServ.editarPersona(pers);
   }
   
    
    //login
    //@PostMapping ("/autentication/login")
    //public Persona loginPersona (@RequestBody Persona pers) {
      //  return persoServ.loginPersona(pers.getEmail(), pers.getClave());
    //}
}
