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

import com.racetospace.springbootracetospace.model.Estudiante;
import com.racetospace.springbootracetospace.service.EstudianteService;


//se debe especificar que es una clase de tipo controlador
@Controller
//se debe especificar el origen de las peticiones, ene ste caso pueden 
//venir de cualquier lado!
@CrossOrigin("*")
@RestController
public class EstudianteController {
    private EstudianteService estudianteService;

    public EstudianteController(@Autowired EstudianteService estudianteService){
        this.estudianteService= estudianteService;
    }
    @PostMapping("/estudiante/Save")
    public void guardarEstudiante(@RequestBody Estudiante estudiante){
        
        estudianteService.saveEstudiante(estudiante);
    }

    //put -> editar datos en la base
    @PutMapping("/estudiante/Update")
    public void editarEstudiante(@RequestBody Estudiante estudiante){
        estudianteService.updateEstudiante(estudiante);
    }

    //delete -> elimnar datos en la base
    @DeleteMapping("/estudiante/Delete/{id}")
    public void eliminarEstudiante(@PathVariable Integer id){
        estudianteService.deleteEstudiante(id);
    }

    //get -> no sirve para obtener datos desde la base de datos
    @GetMapping("/estudiante/FindAll")
    public List<Estudiante> obtenerEstudiantes(){
        return estudianteService.findAll();
    }

    @GetMapping("/estudiante/ConLL")
    public List<Estudiante> estudiantesConLL(){
        return estudianteService.estudiantesConLL();
    }

    @GetMapping("/estudiante/PorModulo/{modulo}")
    public List<Estudiante> estudiantesPorModulo(@PathVariable Integer modulo){
        return estudianteService.estudiantesPorModulo(modulo);
    }
    
    
}
