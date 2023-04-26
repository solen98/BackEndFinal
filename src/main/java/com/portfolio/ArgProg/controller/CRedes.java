
package com.portfolio.ArgProg.controller;

import com.portfolio.ArgProg.entity.Redes;
import com.portfolio.ArgProg.service.SRedes;
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
@RequestMapping("redes") //localhost:8080/yona
@CrossOrigin(origins = "https://portfolio-frontendsoledad.web.app") //direccion del frontend
public class CRedes {
    @Autowired
    SRedes redServ;
    
     @GetMapping ("/lista")
    @ResponseBody
    public List <Redes> verRedes(){
        return redServ.verRedes();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
     public Redes verRed(@PathVariable int id){
        return redServ.buscarRedes(id);
    }
    
    @PostMapping ("/crear")
   public String agregarRed (@RequestBody Redes red){
       redServ.crearRedes(red);
       return "La red fue creada correctamente";
    }
   
   @DeleteMapping ("/borrar/{id}")
   public String eliminarRed (@PathVariable int id){
       redServ.borrarRedes(id);
       return "La red fue borrada correctamente";
   }
   
   //otra forma de editar la redna
   @PutMapping ("/update/{id}")
   public void updateRed(@RequestBody Redes red) {
       redServ.editarRedes(red);
   }
    
}
