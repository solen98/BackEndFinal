
package com.portfolio.ArgProg.controller;

import com.portfolio.ArgProg.entity.Hardskill;
import com.portfolio.ArgProg.service.SHardskill;
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
@RequestMapping("hardskill") //localhost:8080/hardskills
@CrossOrigin(origins = "http://localhost:4200") //direccion del frontend

public class CHardskill {
    @Autowired
    SHardskill hardsServ;
    
     @GetMapping ("/lista")
    @ResponseBody
    public List <Hardskill> verHardskills(){
        return hardsServ.verHardskills();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
     public Hardskill verHardskill(@PathVariable int id){
        return hardsServ.buscarHardskill(id);
    }
    
    @PostMapping ("/crear")
   public String agregarHardskill (@RequestBody Hardskill hards){
       hardsServ.crearHardskill(hards);
       return "La hardskill fue creada correctamente";
    }
   
   @DeleteMapping ("/borrar/{id}")
   public String eliminarHardskill (@PathVariable int id){
       hardsServ.borrarHardskill(id);
       return "La hardskill fue borrada correctamente";
   }
   
   //otra forma de editar la hardsna
   @PutMapping ("/update/{id}")
   public void updateHardskill(@RequestBody Hardskill hards) {
       hardsServ.editarHardskill(hards);
   }
}
