

package com.portfolio.ArgProg.controller;

import com.portfolio.ArgProg.entity.Login;
import com.portfolio.ArgProg.service.SLogin;
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
@RequestMapping("login") //localhost:8080/login
@CrossOrigin(origins = "http://localhost:4200") //direccion del frontend

public class CLogin {
    @Autowired
    SLogin loginServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Login> verLogin(){
        return loginServ.verLogin();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
     public Login verLogin(@PathVariable int id){
        return loginServ.buscarLogin(id);
    }
    
    @PostMapping ("/crear")
   public String agregarLogin (@RequestBody Login entrar){
       loginServ.crearLogin(entrar);
       return "El login fue creado correctamente";
    }
   
   @DeleteMapping ("/borrar/{id}")
   public String eliminarLogin (@PathVariable int id){
       loginServ.borrarLogin(id);
       return "El login fue borrado correctamente";
   }
   
   //otra forma de editar la login
   @PutMapping ("/update")
   public void updateLogin(@RequestBody Login entrar) {
       loginServ.editarLogin(entrar);
   }
   
    
    @PostMapping ("/autentication/login")
    public Login loginLogin (@RequestBody Login entrar) {
        return loginServ.loginLogin(entrar.getEmail(), entrar.getClave());
    }
}


