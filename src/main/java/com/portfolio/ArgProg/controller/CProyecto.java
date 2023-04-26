

package com.portfolio.ArgProg.controller;

import com.portfolio.ArgProg.entity.Proyectos;
import com.portfolio.ArgProg.service.SProyecto;
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
@RequestMapping("proyecto") //localhost:8080/proyena
@CrossOrigin(origins = "https://portfolio-frontendsoledad.web.app") //direccion del frontend


public class CProyecto {
    
    @Autowired
    SProyecto proyeServ;
    
     @GetMapping ("/lista")
    @ResponseBody
    public List <Proyectos> verProyectos(){
        return proyeServ.verProyectos();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
     public Proyectos verProyecto(@PathVariable int id){
        return proyeServ.buscarProyecto(id);
    }
    
    @PostMapping ("/crear")
   public String agregarProyecto (@RequestBody Proyectos proye){
       proyeServ.crearProyecto(proye);
       return "El proyecto fue creada correctamente";
    }
   
   @DeleteMapping ("/borrar/{id}")
   public String eliminarProyecto (@PathVariable int id){
       proyeServ.borrarProyecto(id);
       return "El proyecto fue borrada correctamente";
   }
   
   //otra forma de editar la proyena
   @PutMapping ("/update/{id}")
   public void updateProyecto(@RequestBody Proyectos proye) {
       proyeServ.editarProyecto(proye);
   }
}
