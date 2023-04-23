package com.racetospace.springbootracetospace.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.racetospace.springbootracetospace.model.Modulo;
import com.racetospace.springbootracetospace.service.ModuloService;


//se debe especificar que es una clase de tipo controlador
@Controller
//se debe especificar el origen de las peticiones, ene ste caso pueden 
//venir de cualquier lado!
@CrossOrigin("*")
@RestController
public class ModuloController {
    private ModuloService moduloService;

    public ModuloController(@Autowired ModuloService moduloService){
        this.moduloService= moduloService;
    }
    @PostMapping("/modulo/Save")
    public void guardarModulo(@RequestBody Modulo modulo){
        
        moduloService.saveModulo(modulo);
    }

    //put -> editar datos en la base
    @PutMapping("/modulo/Update")
    public void editarModulo(@RequestBody Modulo modulo){
        moduloService.updateModulo(modulo);
    }

    //delete -> elimnar datos en la base
    @DeleteMapping("/modulo/Delete/{id}")
        public void eliminarModulo(@PathVariable Integer id){
        moduloService.deleteModulo(id);

    }
    //get -> no sirve para obtener datos desde la base de datos
    @GetMapping("/modulo/FindAll")
    public List<Modulo> obtenerModulo(){
        return moduloService.findAll();
    }

    @GetMapping("/modulo/ConP")
        public List<Modulo> modulosConP(){
            return moduloService.modulosConP();
        }

        @GetMapping("/modulo/ConI")
        public List<Modulo> modulosConI(){
            return moduloService.modulosConI();
        }

        @GetMapping("/modulo/ConA")
        public List<Modulo> modulosConA(){
            return moduloService.modulosConA();
        }
        


    }


