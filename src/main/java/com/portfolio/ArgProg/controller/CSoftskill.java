
package com.portfolio.ArgProg.controller;

import com.portfolio.ArgProg.entity.Softskill;
import com.portfolio.ArgProg.service.SSoftskill;
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
@RequestMapping("softskill") //localhost:8080/softsna
@CrossOrigin(origins = "https://portfolio-frontendsoledad.web.app") //direccion del frontend

public class CSoftskill {
    @Autowired
    SSoftskill softsServ;
    
     @GetMapping ("/lista")
    @ResponseBody
    public List <Softskill> verSoftskills(){
        return softsServ.verSoftskills();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
     public Softskill verSoftskill(@PathVariable int id){
        return softsServ.buscarSoftskill(id);
    }
    
    @PostMapping ("/crear")
   public String agregarSoftskill (@RequestBody Softskill softs){
       softsServ.crearSoftskill(softs);
       return "La softskill fue creada correctamente";
    }
   
   @DeleteMapping ("/borrar/{id}")
   public String eliminarSoftskill (@PathVariable int id){
       softsServ.borrarSoftskill(id);
       return "La softskill fue borrada correctamente";
   }
   
   //otra forma de editar la softsna
   @PutMapping ("/update/{id}")
   public void updateSoftskill(@RequestBody Softskill softs) {
       softsServ.editarSoftskill(softs);
   }
}

