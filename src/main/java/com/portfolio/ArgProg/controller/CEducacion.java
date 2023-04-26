
package com.portfolio.ArgProg.controller;

import com.portfolio.ArgProg.entity.Educacion;
import com.portfolio.ArgProg.service.SEducacion;
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
@RequestMapping("educacion") //localhost:8080/educana
@CrossOrigin(origins = "https://portfolio-frontendsoledad.web.app") //direccion del frontend

public class CEducacion {
@Autowired
    SEducacion educaServ;
    
     @GetMapping ("/lista")
    @ResponseBody
    public List <Educacion> verEducacions(){
        return educaServ.verEducacions();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
     public Educacion verEducacion(@PathVariable int id){
        return educaServ.buscarEducacion(id);
    }
    
    @PostMapping ("/crear")
   public String agregarEducacion (@RequestBody Educacion educa){
       educaServ.crearEducacion(educa);
       return "La educacion fue creada correctamente";
    }
   
   @DeleteMapping ("/borrar/{id}")
   public String eliminarEducacion (@PathVariable int id){
       educaServ.borrarEducacion(id);
       return "La educacion fue borrada correctamente";
   }
   
   //otra forma de editar la educana
   @PutMapping ("/update/{id}")
   public void updateEducacion(@RequestBody Educacion educa) {
       educaServ.editarEducacion(educa);
   }
}
